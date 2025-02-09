FROM maven:3.9.9-amazoncorretto-21 AS build

COPY . .

RUN mvn clean package -DskipTests

# Etapa de ejecución

FROM openjdk:21-jdk-slim AS app

COPY --from=build /target/Ejercicio-Veterinaria-0.0.1.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]