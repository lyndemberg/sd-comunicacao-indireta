FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY clientapp/target/clientapp-jar-with-dependencies.jar clientapp-jar-with-dependencies.jar
COPY sender/target/sender-jar-with-dependencies.jar sender-jar-with-dependencies.jar
COPY clientapp/start.sh start.sh
ENTRYPOINT ["sh", "start.sh"]