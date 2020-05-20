#Downloading jre image
FROM openjdk:8-jre-alpine

#Coping jar file to main directory
COPY target/demo-0.0.1-SNAPSHOT.jar /app.jar

#Coping logback.xml into the image
COPY logback.xml /logback.xml

#Running commands to execute the application
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "-Dlogging.config=/logback.xml", "/app.jar"]