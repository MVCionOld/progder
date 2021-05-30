#!/usr/bin/bash

docker run -it -p 5432:5432 --name progder-db -e POSTGRES_PASSWORD=password -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres postgres:latest
