# smartSolution
Project developed in Java with Spring Boot, JUnit and docker.

BackEnd - JavA with Spring Boot;

## Required technologies and libraries.
- Maven: http://maven.apache.org/install.html
- Docker-Compose: https://docs.docker.com/compose/install/
- Junit: https://junit.org/junit5/

## Installation and run
1. Clone this repository: `git clone https://github.com/Deyveson/smartSolution.git`
2. `cd` into the `smartSolution` folder and run the following commands:
    1. Run App `docker-compose up -d --build`
3. Open your browser and see the back end running on `http://localhost:8080/ws-smart-solution/swagger-ui.html`.
5. Open your terminal in the project folder and type `docker-compose ps`, to see the containers running;
6. Open your terminal in the project folder and type `docker logs -f --tail 100 smartsolution_backend_1`, and wait to finish the build.

## Google Cloud - Data Base connection Postgresql
- URL Connecttion: jdbc:postgresql://35.232.154.224:5432/smart
- User: smart
- Password: root

## TDD - Test unit with JUnit
- H2DataBase was used to simulate the database

## API
- Api was documented with swagger-ui for to facilitate testing

![Swagger-ui](https://user-images.githubusercontent.com/35642316/82368997-56701280-99e4-11ea-9b63-58cb66a5135d.png)

