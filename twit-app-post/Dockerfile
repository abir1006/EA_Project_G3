# Use a base image containing Java runtime environment
FROM openjdk:17-jdk-alpine

EXPOSE 8080

ADD target/twit-app-0.0.1-SNAPSHOT.jar twit-app.jar

ENTRYPOINT ["java", "-jar", "/twit-app.jar"]





