FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/sampleapi.jar sampleapi.jar.jar
ENTRYPOINT ["java","-jar","/sampleapi.jar.jar"]