# using multistage docker build
# ref: https://docs.docker.com/develop/develop-images/multistage-build/
    
# temp container to build using gradle
FROM gradle:5.3.0-jdk-alpine AS TEMP_BUILD_IMAGE
# create environment variable to specify path
ENV APP_HOME=/usr/app/ 
WORKDIR $APP_HOME
COPY build.gradle settings.gradle $APP_HOME

  
COPY gradle $APP_HOME/gradle
# Assign right permissions to Gradle file
COPY --chown=gradle:gradle . /home/gradle/src
USER root
# change file directory ownership
RUN chown -R gradle /home/gradle/src

# Run gradle files to build .Jar file for app
RUN gradle build || return 0
# copy all src files and .Jar file generated
COPY . .
RUN gradle clean build


# actual container
FROM openjdk:12-jdk-alpine
# assigning Variable to define our previously created .jar file
ENV ARTIFACT_NAME=calc-project-1.0-SNAPSHOT.jar
ENV APP_HOME=/usr/app    
WORKDIR $APP_HOME
COPY --from=TEMP_BUILD_IMAGE $APP_HOME/build/libs/*.jar ./$ARTIFACT_NAME

# opening port to access app through web browser i.e (http://localhost:8080)    
EXPOSE 8080
# Defining entry point for when we run container, also configured to auto launch calculator app when container is run
# ENTRYPOINT exec java -jar ${ARTIFACT_NAME}
CMD exec java -jar ${ARTIFACT_NAME}