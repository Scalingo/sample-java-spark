# Sample Application using Java and Spark

This sample is running on: https://java-spark.is-easy-on-scalingo.com/

## Deploy via Git

Create an application on https://scalingo.com, then:

```shell
scalingo -a my-app git-setup
git push scalingo master
```

And that's it!

## Deploy via One-Click

[![Deploy to Scalingo](https://cdn.scalingo.com/deploy/button.svg)](https://dashboard.scalingo.com/create/app?source=https://github.com/Scalingo/sample-java-spark#master)

## Running Locally

Build with:

```shell
docker compose build
```

This is automatically done when building the container.
However, it is mandatory to build it again after modifying a file.

Run the server with:

```shell
docker composer up
```

The application is available at: http://localhost:3000/.
