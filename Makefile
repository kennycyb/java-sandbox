IMAGE_NAME ?= java-sandbox
DOCKER ?= docker
ARGS ?=

.PHONY: build run

build:
	$(DOCKER) build -t $(IMAGE_NAME) .

run: build
	$(DOCKER) run --rm $(IMAGE_NAME) $(ARGS)
