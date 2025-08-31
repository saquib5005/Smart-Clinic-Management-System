# Build Stage
FROM maven:3.9.0-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run Stage
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/smart-clinic.jar smart-clinic.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","smart-clinic.jar"]
