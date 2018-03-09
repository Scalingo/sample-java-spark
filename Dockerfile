FROM maven:3.5.2-jdk-8

WORKDIR /usr/src/app

EXPOSE 3000

COPY . /usr/src/app

CMD "mvn clean install"
