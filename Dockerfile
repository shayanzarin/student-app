FROM openjdk:26-ea-jdk
ADD target/student-app.jar student-app.jar
ENTRYPOINT ["java","-jar","student-app.jar"]  
