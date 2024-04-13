FROM gradle:8.7.0-jdk21 AS builder
WORKDIR /app
COPY . .
RUN gradle clean bootJar

FROM eclipse-temurin:21
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar /app/spring-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/spring-app.jar"]