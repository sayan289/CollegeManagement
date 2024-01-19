# College Management System

## Overview

This is a college management system containing four databases: student database, college database, teacher database, and department table. There is a one-to-many relationship between the college and student database because multiple students are assigned to one college. There is a many-to-one relationship present between the department table and teacher table because multiple teachers are assigned to one department.

## Project Components

### Controller

In the Controller layer, the main component is `CollegeController`. This class is responsible for handling the mapping of incoming requests. To achieve loose coupling and enhance maintainability, `CollegeController` references a Service layer interface instead of a Service layer class which implements the methods of that interface.

### Service Layer

The Service layer encapsulates the business logic of the application. For the sake of abstraction and adhering to best practices, an interface is utilized in the Service layer. The Service layer communicates with the DAO (Data Access Object) layer. In this layer, all the logic is written to ensure the application's functionality.

### DAO Layer

The DAO (Data Access Object) layer is responsible for interacting with the database. In this project, an entity named `Student` is created in the DAO layer. This entity is mapped to a database table and serves the purpose of modeling student data within the system.

### Entity

There are four entities present:
- College Entity
- Student Entity
- Teacher Entity
- Department Entity

- --

## Technology Stack

- Spring Framework: 3.2.2
- JDK Version: 17
- Database: `MySQL`
- Build Tool: `Maven`
