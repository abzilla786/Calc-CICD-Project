FROM gradle:4.7.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 

FROM openjdk:8-jre-slim

EXPOSE 8080

