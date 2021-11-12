FROM java:8
MAINTAINER Totoro
ADD jar/app.jar /root/docker_test/app.jar
ENTRYPOINT ["nohup","java","-jar","/root/docker_test/app.jar","&"]
