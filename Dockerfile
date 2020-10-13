FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN mkdir app
ADD target/gs-spring-boot-docker-0.1.0.jar /app/gs-spring-boot-docker-0.1.0.jar
WORKDIR /app
ENV JAVA_OPTS="-Xmx256m -Xms256m -XX:MetaspaceSize=48m -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar gs-spring-boot-docker-0.1.0.jar" ]
