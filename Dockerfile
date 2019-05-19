FROM openjdk:8-jdk
WORKDIR /app
COPY target/miketripsrest-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "miketripsrest-0.0.1-SNAPSHOT.jar"]



