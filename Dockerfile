# Use an official OpenJDK runtime with Java 21
FROM openjdk:21-jdk-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy Gradle wrapper and configuration files
COPY gradlew build.gradle settings.gradle /app/
COPY gradle /app/gradle

# Grant execution permissions for the Gradle wrapper
RUN chmod +x gradlew

# Download dependencies and build the application
RUN ./gradlew build -x test --no-daemon

# Copy the source code
COPY src /app/src

# Run the build to create the application JAR
RUN ./gradlew bootJar --no-daemon

# Production image with Java 21
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
