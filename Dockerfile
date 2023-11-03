FROM openjdk:17.0.1-jdk-slim

# Set the working directory inside the container
WORKDIR /app


# Copy the JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application will run on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
