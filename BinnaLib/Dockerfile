# Stage 1: Build the JAR
FROM maven:3.9.5-eclipse-temurin-21 AS build
WORKDIR /app

# Copy pom.xml and download dependencies first (cache step)
COPY pom.xml .
RUN mvn -B dependency:go-offline

# Copy entire project and build JAR
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/Binna-Lib.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
