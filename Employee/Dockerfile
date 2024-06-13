FROM openjdk:17-oracle             
VOLUME /tmp                                    
ADD target/employee-0.0.1-SNAPSHOT.jar employee.jar
ENTRYPOINT ["java","-jar","/employee.jar"]