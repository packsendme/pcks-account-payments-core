
FROM openjdk:8-jdk-alpine
EXPOSE 9179
COPY /target/pcks-account-payment-core-0.0.1-SNAPSHOT.jar pcks-account-payment-core-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/pcks-account-payment-core-0.0.1-SNAPSHOT.jar"]