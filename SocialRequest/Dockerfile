FROM openjdk:8-jdk AS build
COPY . /usr/local/src
WORKDIR /usr/local/src
RUN apt-get -y update
RUN apt-get -y upgrade
RUN apt-get -y install maven
RUN mvn package

FROM openjdk:8-jre
COPY --from=build /usr/local/src/target/socialrequest-0.0.1-SNAPSHOT.jar /usr/local/lib/Socialrequest/
WORKDIR /usr/local/lib/Socialrequest/
EXPOSE 8080
CMD ["java", "-jar", "socialrequest-0.0.1-SNAPSHOT.jar"]