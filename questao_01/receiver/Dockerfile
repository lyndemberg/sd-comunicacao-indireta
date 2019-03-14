FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY target/receiver-jar-with-dependencies.jar receiver-jar-with-dependencies.jar
EXPOSE 10991
CMD ["java", "-jar", "receiver-jar-with-dependencies.jar"]