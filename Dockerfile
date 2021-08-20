#build
FROM maven:3.6.0-jdk-11-slim AS builder

WORKDIR /app

COPY . .

RUN mvn -f /app/pom.xml clean package

#PACKAGE

FROM openjdk:11-jre-slim

COPY --from=builder /app/target/*.jar /usr/local/lib/app.jar

ENTRYPOINT [ "java", "-jar", "/usr/local/lib/app.jar" ]

