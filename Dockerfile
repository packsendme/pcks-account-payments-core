
FROM openjdk:8-jdk-alpine
EXPOSE 9179
COPY /target/pcks-account-payments-core-0.0.1-SNAPSHOT.jar pcks-account-payments-core-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/pcks-account-payments-core-0.0.1-SNAPSHOT.jar"]
