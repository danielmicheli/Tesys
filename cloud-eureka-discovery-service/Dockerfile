FROM openjdk:17-oracle  
VOLUME /tmp
COPY target/cloud-eureka-discovery-service-0.0.1-SNAPSHOT.jar eureka.jar
ENTRYPOINT ["java","-jar","/eureka.jar"]

