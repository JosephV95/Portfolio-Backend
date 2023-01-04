FROM amazoncorretto:11-alpine-jdk
MAINTAINER jose
COPY target/jose-0.0.1-SNAPSHOT.jar jose-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jose-0.0.1-SNAPSHOT.jar"]