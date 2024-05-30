FROM openjdk:17-oracle             
VOLUME /tmp                                    
ADD target/department-0.0.1-SNAPSHOT.jar department.jar 
ENTRYPOINT ["java","-jar","/department.jar"]