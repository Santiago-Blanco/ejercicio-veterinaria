FROM maven:3.9.9-amazoncorretto-21 AS build

#copia todos los archivos del proyecto
COPY . .

RUN mvn clean package -DskipTests  # Ejecuta Maven para crear el archivo JAR

# Etapa de ejecución
FROM openjdk:21-jdk-slim AS app

# Copia el archivo JAR desde la etapa de build al contenedor final
COPY --from=build /workspace/target/Ejercicio-Veterinaria-0.0.1.jar app.jar

EXPOSE 8080  # Expone el puerto 8080

# Ejecuta el JAR con Java
ENTRYPOINT ["java", "-jar", "app.jar"]
