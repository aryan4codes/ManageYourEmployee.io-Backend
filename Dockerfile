FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY target/restful-web-services-0.0.1-SNAPSHOT.jar restful-web-services.jar
ENTRYPOINT ["java", "-jar", "/restful-web-services.jar"]
