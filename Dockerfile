FROM openjdk:15
VOLUME /redis-service
ARG JAR_FILE=target/assignment-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-app.jar"]
