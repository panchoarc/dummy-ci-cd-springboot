FROM openjdk:17
EXPOSE 8080
ADD target/springboot-images-gh.jar springboot-images-gh.jar
ENTRYPOINT ["java","-jar","/springboot-images-gh.jar"]