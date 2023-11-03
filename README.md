# Spring-mvc-6challenge-demo
# My Spring Boot Dockerized Application

This is a basic Spring Boot application containerized with Docker. It serves as a starting point for practicing DevOps build tools and containerization. The application provides a simple landing page.
## Prerequisites

- [Docker](https://docs.docker.com/get-docker/)
- [Java Development Kit (JDK) 17](https://openjdk.java.net/)

## Getting Started

1. Clone this repository to your local machine:

    ```shell
    git clone https://github.com/janmeshjs/Spring-mvc-6challenge-demo.git
    cd Spring-mvc-6challenge-demo
    ```

2. Build the Docker image:

    ```shell
    docker build -t spring-docker-app .
    ```

3. Run the Docker container:

    ```shell
    docker run -p 8080:8080 spring-docker-app
    ```

4. Access the application in your web browser at http://localhost:8080.

## Directory Structure

- `src/` - Contains the source code of the Spring Boot application.
- `pom.xml` - Maven project configuration file.
- `Dockerfile` - Dockerfile for building the Docker image.
- `README.md` - This README file.

## Additional Information

- This project uses Spring Boot, a powerful framework for building Java applications.
- The application serves a basic landing page by reading an HTML file from the classpath.
- You can customize the HTML content by modifying the `templates/index.html` file.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to fork this repository and adapt it to your needs.

Happy coding!
