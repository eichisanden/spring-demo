FROM openjdk:11.0.6
RUN mkdir /app
WORKDIR /app
ENTRYPOINT [ "sh", "-c", "java -jar build/libs/spring-demo-0.0.1.jar" ]
