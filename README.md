# java-sandbox
Java Sandbox (using maven)

## Run with Docker

Build the image and run the application:

```sh
make run
```

Show CLI help:

```sh
make run ARGS=help
```

To build the image without running it:

```sh
make build
```

Set `IMAGE_NAME` to use a different image name, for example `make run IMAGE_NAME=my-java-app`.
