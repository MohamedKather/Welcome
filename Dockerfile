FROM openjdk:13-jdk-alpine

ADD target/welcome-0.0.1-SNAPSHOT.jar welcome-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","welcome-0.0.1-SNAPSHOT.jar"]