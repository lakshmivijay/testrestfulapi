FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY target/*.jar restapi-app.jar

EXPOSE 8800

ENTRYPOINT ["java","-jar","restapi-app.jar"]