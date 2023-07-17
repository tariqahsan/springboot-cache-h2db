# Use the official OpenJDK 11 as the base image
FROM adoptopenjdk:11-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file and any other necessary files from the host to the container
COPY target/springboot-cache-h2db.jar /app/springboot-cache-h2db.jar

# Expose the port on which the Spring Boot application will listen
EXPOSE 9595

# Specify the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "/app/springboot-cache-h2db.jar"]
