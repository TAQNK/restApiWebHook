# Use maintained Java 17 image
FROM eclipse-temurin:25-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Give permission to mvnw
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the jar file
CMD ["sh", "-c", "java -jar target/*.jar"]
