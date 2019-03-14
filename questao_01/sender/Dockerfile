FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY target/sender-jar-with-dependencies.jar sender-jar-with-dependencies.jar
EXPOSE 10990
CMD ["java", "-jar", "sender-jar-with-dependencies.jar"]