FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /home/app

COPY src src
COPY pom.xml pom.xml
RUN mvn -f /home/app/pom.xml clean package -q

FROM openjdk:11.0-jre-slim-buster

LABEL "org.example.Bikiny-Galley-Grub"="Bikiny-Galley-Grub"
LABEL version=1.0-SNAPSHOT
LABEL mantainer="pborrasexposito@cifpfbmoll.eu"

COPY --from=build /home/app/target/Bikiny-Galley-Grub-1.0-SNAPSHOT.jar /usr/local/lib/Bikiny-Galley-Grub.jar
CMD ["java","-jar","/usr/local/lib/Bikiny-Galley-Grub.jar"]
