FROM maven:3.9.4-eclipse-temurin-25

WORKDIR /usr/src/app

EXPOSE 3000

COPY . /usr/src/app

CMD ["mvn", "clean", "package"]
