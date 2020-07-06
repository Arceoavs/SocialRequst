# SocialRequest Project

This project consists of 3 applications:

- The main application `SocialRequest` is the main UI and Backend for this applications.
- A service application `SocialRequest-Maps` is a wrapper for the TomTom API to perform geo-tasks.
- A service application `SocialRequest-Leaderboard` keeps track of fulfilled requests and corresponding travelled distances. Via SOAP, it can return an all-time leaderboard as well as one for the current month.

## Setup

Please follow the instructions in the separate `README.md` files in the described subfolders (subprojects).

**TLDR;**

- install `Docker` and `docker-compose`
- build the container for the ActiveMQ instance to enable JMS communication: `docker-compose build`
- Get an API key for the TomTom API (you have to register first)
- Setup your dotenv file in the Maps project:
  - `cd SocialRequest-Maps`
  - `cp .env.sample .env`
  - Insert your API key at the environment variable called `API_KEY=`

## Start the Applications

(Each of the following commands are executed from the main directory)

1. First, start the ActiveMQ instance: `docker-compose up`
2. Then, start the Maps application: `cd SocialRequest-Maps && ./mvnw spring-boot:run`
3. Then, start the Leaderboard application: `cd SocialRequest-Leaderboard && ./mvnw spring-boot:run`
4. Last, start the main application: `cd SocialRequest && ./mvnw spring-boot:run`

## Help

If you have any problems regarding

- an infinite rebuilding problem
- missing generated resources
- etc.

, please execute the following commands (in the respective project):

```bash
./mvnw clean
./mvnw eclipse:clean eclipse:eclipse
./mvnw install
```

## Copyright

Copyright (C) 2020 ACSE Group6
