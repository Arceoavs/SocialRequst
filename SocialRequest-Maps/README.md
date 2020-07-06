# SocialRequest-Maps

This is a subproject (service) for the main application SocialRequest and acts as a "proxy"
for the TomTom API.

It uses Geocoding, Route Descriptions, and Distance Calculation.

## Setup

This project uses Dotenv in order not to expose personal API secrets to others.
Hence, in order to use this service application, please get an API key for the TomTom
API.

Then:

- execute `cp .env.example .env` to copy the sample Dotenv file
- insert your personal API secret to the key `API_KEY`

## Start the Server

Then, start the server with `./mvnw spring-boot:run`

## Copyright

Copyright (C) 2020 ACSE Group6
