FROM java:8
MAINTAINER zyzbeckham
ADD target/oauth-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]