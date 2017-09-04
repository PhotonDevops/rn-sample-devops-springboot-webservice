FROM maven:3.5-jdk-8-alpine

USER root

RUN mkdir -p /springboot-service
ADD ./src /springboot-service/src
ADD ./pom.xml /springboot-service/pom.xml

WORKDIR /springboot-service
RUN mvn clean package

EXPOSE 7070

CMD java -jar target/devops-login-api-0.0.1.jar
