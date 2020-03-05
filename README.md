# Java Hexagonal Quickstart Architecture

This quickstart project uses Java 8 and Hexagonal Architecture with the following libraries:

- **Spring Boot Starter Web** - for building web, including RESTful applications;
- **Spring Boot Starter Actuator** - app monitoring, gathering metrics, understanding traffic or the state of database becomes trivial with this dependency;
- **Log4J** - Logging library;
- **Lombok** - Never write another getter or equals method again;
- **Togglez** - Toggle feature library with admin interface;
- **Gson** - Goggle library for serialization/deserialization of JSON;  
- **JUnit** - Unit testing library;
- **Mockito** - A mocking library for unit testing in Java;
- **Wiremock** - A mocking API tool for Java;
- **Hamcrest** - Assists writing tests within JUnit and jMock;
- **Wiremock standalone** - To mock API request when using the the local environment;
- **Guava** - Library for extending the basic Java collections functionalities;
- **Apache Commons** - provides reusable, open source Java software;
- **Apache HTTP Client** - efficient, up-to-date, and feature-rich package implementing the client side of the most recent HTTP standards and recommendations.

## Prerequisites

You need the following software installed in your local machine before installing this repository:

* Apache Maven;
* Java JDK;
* Git.

## Installing

1) First, clone the repository using GIT;

2) Then, open the project with your preferred IDE;

3) Configure the JDK (example 11) and Java Version (example 8) of the project;

4) Install the Lombok plugin in your IDE.

## Building

Use maven to build the project:

```
mvn clean install
```

## Running the application

To run the application, use the built-in spring boot run goal:

```
mvn spring-boot:run
```

The application will be available at http://locahost:8080/.

