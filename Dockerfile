FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/docker.jar /app/app.jar
EXPOSE 9087
ENTRYPOINT ["java", "-jar", "app.jar"]