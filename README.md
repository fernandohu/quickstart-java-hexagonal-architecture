# Java Hexagonal Architecture Quickstart 

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

## Hexagonal Architecture

The idea here is to organize the project using Hexagonal Architecture.

In this pattern, we put business rules inside the `core` folder (some people prefer to use 'application'). This is where you store the core code related to your domain. If you need to communicate with external sources like databases, queues, cache, rest, soap, file or any other source, you will create interfaces inside this folder, but not the implementation. The `core` is independent from the rest of the system, it only has to know interfaces. It means that the core has its own defined entities (it will not use DTOs created to work with external sources).

Communication from and to external systems should be implemented in the `adapter` folder. Incoming communication like REST controllers, SOAP Endpoints, Batch execution and any other kind of entry point should be implemented here. Outgoing communication with databases, queues, cache, rest, soap, http requests, file or any other type of outgoing request should also be implemented here. The `adapter` is dependent on the 'core', it uses interfaces located there. You will not write business rules related to your domain here.

The `config` folder should store any configuration related to things like Spring or Beans.

Going back to the `core`, in the `ports` folder the concept of `UseCase` is used to denote a class representing a single business rule, with single responsibility. The concept of `Port` is used to denote an outgoing communication with an external source.

![Hexagonal Architecture 1](https://github.com/fernandohu/quickstart-java-hexagonal-architecture/blob/master/resources/hexagonal-architecture-1.png)

![Hexagonal Architecture 2](https://github.com/fernandohu/quickstart-java-hexagonal-architecture/blob/master/resources/hexagonal-architecture-2.png)

![Hexagonal Architecture 3](https://github.com/fernandohu/quickstart-java-hexagonal-architecture/blob/master/resources/hexagonal-architecture-3.png)

