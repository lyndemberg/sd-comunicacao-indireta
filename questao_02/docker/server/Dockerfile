FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY serverapp/target/serverapp-jar-with-dependencies.jar serverapp-jar-with-dependencies.jar
COPY receiver/target/receiver-jar-with-dependencies.jar receiver-jar-with-dependencies.jar
COPY serverapp/start.sh start.sh
EXPOSE 10991
ENTRYPOINT ["sh", "start.sh"]
