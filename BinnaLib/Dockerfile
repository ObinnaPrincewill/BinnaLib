# Use lightweight Java 21 JDK
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR into the container
COPY target/Binna-Lib.jar app.jar

# Expose the port your app will run on
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
