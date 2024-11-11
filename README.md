# Example2: Simple Java HTTP Server in Docker

A simple Java program that greets the user with a message, dockerized for easy execution in any environment.

## Description

This is a basic Java program that uses the `HttpServer` class to create a simple HTTP server. When accessed in a browser at the root (`/`) route, it displays a welcome message in red text.

## Technologies Used

- Java 17
- Docker

## Prerequisites

To run this project, you need to have Docker installed on your machine. If you don't have it, you can download it from [here](https://www.docker.com/products/docker-desktop).

## Instructions to Run the Project

1. **Clone this repository:**

   If you haven't cloned the repository yet, you can do so with the following command:

   ```bash
   git clone https://github.com/klever1995/Example2.git

2. **Pull the Docker image:** 
   Before running the container, pull the Docker image with the following command:

   ```bash
   docker pull ksrobalino/example_java:v1

3. **Run the Docker container:** 
   After pulling the image, run the container using this command:

   ```bash
   docker run -d -p 8080:8080 --name mi_contenedor ksrobalino/example_java:v1

4. **Access the application:** 
   Once the container is running, you can access the application by navigating to the following URL in your web browser:
   http://localhost:8080
