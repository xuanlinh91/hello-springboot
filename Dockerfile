FROM java:8
EXPOSE 8080
ADD build/libs/hello-0.1.0.jar hello.jar
ENTRYPOINT  ["java", "-jar", "hello.jar"]