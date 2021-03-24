# springboot-redis
# Spring-Boot application using Redis

This is a sample spring-boot project to demonstrate redis with spring-boot.

## Requirements
* Java 11
* Apache Maven 3.5.0 or higher

## How to Run

- Clone the project
- Build the project  
```
mvn clean install
```
- Run the application
```
java -jar target/redis-0.0.1-SNAPSHOT.jar
```
- Make sure your redis-server is up and running

## Using docker

- Build the project  
```
mvn clean install
```
- Run using docker-compose
```
docker-compose up --build 
```
