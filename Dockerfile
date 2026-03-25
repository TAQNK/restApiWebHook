# Use official Java runtime
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Give permission to mvnw
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port (Render will override with PORT)
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/*.jar"]
