FROM java:8
MAINTAINER hillol.mojave@gmail.com
EXPOSE 8888
ADD target/*.jar /app.jar
RUN bash -c 'touch /app.jar'
CMD ["java","-Dspring.profiles.active=docker","-jar","/app.jar"]