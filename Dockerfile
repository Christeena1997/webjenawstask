FROM eclipse-temurin:17
COPY target/webjenawstask.jar webjenawstask.jar
CMD [ "java","-jar","webjenawstask.jar" ]