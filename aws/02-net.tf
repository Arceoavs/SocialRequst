### Networks

resource "aws_vpc" "socialrequest" {
  cidr_block           = "10.0.0.0/16"
  enable_dns_support   = true
  enable_dns_hostnames = true
}

resource "aws_subnet" "socialrequest" {
  count = 2

  vpc_id            = aws_vpc.socialrequest.id
  cidr_block        = cidrsubnet(aws_vpc.socialrequest.cidr_block, 8, count.index)
}

### Routing Table

resource "aws_internet_gateway" "socialrequest" {
  vpc_id = aws_vpc.socialrequest.id
}

resource "aws_route_table" "socialrequest" {
  vpc_id = aws_vpc.socialrequest.id

  route {
    cidr_block = "0.0.0.0/0"
    gateway_id = aws_internet_gateway.socialrequest.id
  }
}

resource "aws_route_table_association" "socialrequest" {
  count = length(aws_subnet.socialrequest)

  route_table_id = aws_route_table.socialrequest.id
  subnet_id      = aws_subnet.socialrequest[count.index].id
}

### DNS Zone

resource "aws_route53_zone" "socialrequest_local" {
  name = "socialrequest.local"

  vpc {
    vpc_id = aws_vpc.socialrequest.id
  }
}