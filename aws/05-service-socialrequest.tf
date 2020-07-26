### Logging

resource "aws_cloudwatch_log_group" "socialrequest" {
  name = "/ecs/socialrequest"
}

### Task Definition

resource "aws_ecs_task_definition" "socialrequest" {
  family                   = "socialrequest"
  requires_compatibilities = ["FARGATE"]
  cpu                      = 1024
  memory                   = 2048
  network_mode             = "awsvpc"
  execution_role_arn       = data.aws_iam_role.ecsTaskExecutionRole.arn

  container_definitions = <<CONTAINER_DEFINITIONS
  [
    {
      "name": "socialrequest",
      "image": "pantajoe/acse_2020_socialrequest:latest",
      "essential": true,
      "cpu": 1024,
      "memory": 2048,
      "memoryReservation": 2048,
      "environment": [
        { "name": "DB_HOST",     "value": "${aws_route53_record.mysql_socialrequest_local.fqdn}" }
      ],
      "portMappings": [
        {
          "containerPort": 80,
          "protocol": "tcp"
        }
      ],
      "logConfiguration": {
        "logDriver": "awslogs",
        "options": {
          "awslogs-group": "${aws_cloudwatch_log_group.socialrequest.name}",
          "awslogs-region": "us-east-1",
          "awslogs-stream-prefix": "ecs"
        }
      }
    }
  ]
  CONTAINER_DEFINITIONS
}

### Security Groups

resource "aws_security_group" "socialrequest" {
  name   = "socialrequest"
  vpc_id = aws_vpc.socialrequest.id

  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = [aws_vpc.socialrequest.cidr_block]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_security_group" "socialrequest-lb" {
  name   = "socialrequest-lb"
  vpc_id = aws_vpc.socialrequest.id

  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

### Load Balancer

resource "aws_lb_target_group" "socialrequest" {
  name        = "socialrequest"
  vpc_id      = aws_vpc.socialrequest.id
  target_type = "ip"
  protocol    = "HTTP"
  port        = 80

  stickiness {
    enabled         = true
    type            = "lb_cookie"
    cookie_duration = 86400
  }

  health_check {
    enabled  = true
    interval = 10
    protocol = "HTTP"
    port     = 80
    path     = "/"
    matcher  = "200-399"
  }
}

resource "aws_lb" "socialrequest" {
  name               = "socialrequest"
  load_balancer_type = "application"
  internal           = false
  subnets            = aws_subnet.socialrequest[*].id
  security_groups    = [aws_security_group.socialrequest-lb.id]
}

resource "aws_lb_listener" "socialrequest" {
  load_balancer_arn = aws_lb.socialrequest.arn
  protocol          = "HTTP"
  port              = 80

  default_action {
    type             = "forward"
    target_group_arn = aws_lb_target_group.socialrequest.arn
  }
}

### DNS Record

# Of cause a public DNS record could be configured in the same way
resource "aws_route53_record" "wordpress_socialrequest_local" {
  zone_id = aws_route53_zone.socialrequest_local.zone_id
  name    = "wordpress"
  type    = "A"

  alias {
    name                   = aws_lb.socialrequest.dns_name
    zone_id                = aws_lb.socialrequest.zone_id
    evaluate_target_health = true
  }
}

### ECS Service

resource "aws_ecs_service" "socialrequest" {
  name            = "socialrequest"
  cluster         = aws_ecs_cluster.socialrequest.id
  task_definition = aws_ecs_task_definition.socialrequest.arn
  launch_type     = "FARGATE"

  scheduling_strategy                = "REPLICA"
  desired_count                      = 3
  deployment_minimum_healthy_percent = 100
  deployment_maximum_percent         = 200

  network_configuration {
    subnets          = aws_subnet.socialrequest[*].id
    security_groups  = [aws_security_group.socialrequest.id]
    assign_public_ip = true
  }

  load_balancer {
    target_group_arn = aws_lb_target_group.socialrequest.arn
    container_name   = "socialrequest"
    container_port   = 80
  }

  depends_on = [aws_lb.socialrequest]
}