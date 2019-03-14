FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY target/serverapp-jar-with-dependencies.jar serverapp-jar-with-dependencies.jar
EXPOSE 10992
CMD ["java", "-jar", "serverapp-jar-with-dependencies.jar"]