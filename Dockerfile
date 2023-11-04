FROM openjdk:17.0.1-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-app.jar app1.jar

# Copy the application.properties file into the container
COPY src/main/resources/application.properties /app/

# Expose the port your application will run on
EXPOSE 8000

# Run the application
CMD ["java", "-jar", "app1.jar"]
