# java-web-maven-spring-graphql-mysql

## Description
A springboot java maven build,
that connects to mysql database.

Uses spring's crudrepository and graphql.
There are 2 queries and a single mutation
defined.

## Tech stack
- springboot
  - web
- graphql
- maven

## Docker stack
- mariadb:latest
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
- Endpoints
  - curl -X POST -d '{ "query": "{findAllDogs}"}' http://localhost:80/apis/graphql
  - curl -X POST -d '{ "query": "{countAll}"}' http://localhost:80/apis/graphql
  - curl -X POST -d '{"query": "mutation { createDog(breed: \"long pole\", color: \"pointy\") }" }' http://localhost/apis/graphql

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Code concept](https://www.bezkoder.com/spring-boot-graphql-mongodb-example-graphql-java/)
- [Curl examples](https://www.maxivanov.io/make-graphql-requests-with-curl/)
