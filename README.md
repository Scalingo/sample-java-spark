# sample-java-spark

## Dev environment

Build with:

```sh
docker-compose run sample-java-spark mvn clean install
```

This is automatically done when building the container. However, it is
mandatory to build it again after modifying a file.

Run the server with:

```sh
docker-composer up --build
```

Then the website is available at `http://localhost:3000/`.
