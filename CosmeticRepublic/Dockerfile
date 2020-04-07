FROM maven:3.6.0-jdk-8-slim

WORKDIR /app
COPY . /app

ENTRYPOINT ["mvn", "-e", "-X", "spring-boot:run"]