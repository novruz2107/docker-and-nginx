FROM alpine:3.14
RUN apk add --no-cache openjdk11
COPY build/libs/docker-task-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
CMD java -jar /app/docker-task-0.0.1-SNAPSHOT.jar