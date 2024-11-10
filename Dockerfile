FROM openjdk:17
EXPOSE 8080
ADD target/docker-image-gen-test.jar docker-image-gen-test.jar
ENTRYPOINT ["java","-jar","/docker-image-gen-test.jar"]
