FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY target/*.jar book.jar
ENTRYPOINT ["java", "-jar", "book.jar"]
