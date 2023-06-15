FROM maven:3.8.3-openjdk-17-slim
COPY . /app
WORKDIR /app
RUN mvn clean install
WORKDIR /app/target
EXPOSE 8080
ENTRYPOINT [ "java","-jar"."targetapp.jar" ]