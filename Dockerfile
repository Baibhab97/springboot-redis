FROM openjdk:15
VOLUME /redis-service
ARG JAR_FILE=target/assignment-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} adloid-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/adloid-service.jar"]
