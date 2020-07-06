# SocialRequest-Leaderboard

This projects is a subproject (service) application for the main SocialRequest application.
It uses SOAP to return an all-time and a monthly leaderboard regarding users fulfilling requests
and travelling distances to fulfill them.

## Setup

- install Docker and docker-compose
- go to the main directory `cd ..` and execute `docker-compose build`

## Start the Server

Before starting any server (SocialRequest or SocialRequest-Leaderboard),
make sure that an ActiveMQ instance is running to allow both applications to use JMS
by executing `docker-compose up` in the main directory (`cd ..`).

Then, start the server with the command `./mvnw spring-boot:run`.

## Copyright

Copyright (C) 2020 ACSE Group6
