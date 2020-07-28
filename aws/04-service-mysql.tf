### Logging

resource "aws_cloudwatch_log_group" "socialrequest-mysql" {
  name = "/ecs/socialrequest-mysql"
}

### Task Definition

resource "aws_ecs_task_definition" "socialrequest-mysql" {
  family                   = "socialrequest-mysql"
  requires_compatibilities = ["FARGATE"]
  cpu                      = 1024
  memory                   = 2048
  network_mode             = "awsvpc"
  execution_role_arn       = data.aws_iam_role.ecsTaskExecutionRole.arn

  container_definitions = <<CONTAINER_DEFINITIONS
  [
    {
      "name": "mysql",
      "image": "mysql:5.7",
      "essential": true,
      "cpu": 1024,
      "memory": 2048,
      "memoryReservation": 2048,
      "environment": [
        { "name": "MYSQL_DATABASE",             "value": "social_request" },
        { "name": "MYSQL_USER",                 "value": "social_requestor" },
        { "name": "MYSQL_PASSWORD",             "value": "social_requestor" },
        { "name": "MYSQL_RANDOM_ROOT_PASSWORD", "value": "'1'" }
      ],
      "portMappings": [
        {
          "containerPort": 3306,
          "protocol": "tcp"
        }
      ],
      "logConfiguration": {
        "logDriver": "awslogs",
        "options": {
          "awslogs-group": "${aws_cloudwatch_log_group.socialrequest-mysql.name}",
          "awslogs-region": "us-east-1",
          "awslogs-stream-prefix": "ecs"
        }
      }
    }
  ]
  CONTAINER_DEFINITIONS
}

### Security Groups

resource "aws_security_group" "socialrequest-mysql" {
  name   = "socialrequest-mysql"
  vpc_id = aws_vpc.socialrequest.id

  ingress {
    from_port   = 3306
    to_port     = 3306
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

### Load Balancer

resource "aws_lb_target_group" "socialrequest-mysql" {
  name        = "socialrequest-mysql"
  vpc_id      = aws_vpc.socialrequest.id
  target_type = "ip"
  protocol    = "TCP"
  port        = 3306

  health_check {
    enabled  = true
    interval = 10
    protocol = "TCP"
    port     = 3306
  }
}

resource "aws_lb" "socialrequest-mysql" {
  name               = "socialrequest-mysql"
  load_balancer_type = "network"
  internal           = true
  subnets            = aws_subnet.socialrequest[*].id
}

resource "aws_lb_listener" "socialrequest-mysql" {
  load_balancer_arn = aws_lb.socialrequest-mysql.arn
  protocol          = "TCP"
  port              = 3306

  default_action {
    type             = "forward"
    target_group_arn = aws_lb_target_group.socialrequest-mysql.arn
  }
}

### DNS Record

resource "aws_route53_record" "mysql_socialrequest_local" {
  zone_id = aws_route53_zone.socialrequest_local.zone_id
  name    = "mysql"
  type    = "A"

  alias {
    name                   = aws_lb.socialrequest-mysql.dns_name
    zone_id                = aws_lb.socialrequest-mysql.zone_id
    evaluate_target_health = true
  }
}

### ECS Service

resource "aws_ecs_service" "socialrequest-mysql" {
  name            = "socialrequest-mysql"
  cluster         = aws_ecs_cluster.socialrequest.id
  task_definition = aws_ecs_task_definition.socialrequest-mysql.arn
  launch_type     = "FARGATE"

  scheduling_strategy                = "REPLICA"
  desired_count                      = 1
  deployment_minimum_healthy_percent = 100
  deployment_maximum_percent         = 200

  network_configuration {
    subnets          = aws_subnet.socialrequest[*].id
    security_groups  = [aws_security_group.socialrequest-mysql.id]
    assign_public_ip = true
  }

  load_balancer {
    target_group_arn = aws_lb_target_group.socialrequest-mysql.arn
    container_name   = "mysql"
    container_port   = 3306
  }

  depends_on = [aws_lb.socialrequest-mysql]
}
