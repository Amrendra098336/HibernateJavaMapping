# Order Service Application

## Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed Java 17.
- You have installed and configured [Project Lombok](https://projectlombok.org/setup/overview) in your IDE.

## Overview

The Order Service Application is a Spring Boot application written in Java for managing orders and products. It uses Spring Data JPA for persistence, MySQL as the database, and Flyway for database migrations.

## Structure of the Project

The project is organized into two main packages:

1. `com.orderservice.domain` - Contains all the entities (Address, OrderHeader, Product) and the respective enums (OrderStatus, ProductStatus).
2. `com.orderservice.repository` - Contains Spring Data JPA repositories for accessing the database.

## Database Setup

1. Run `mysql-setup.sql` file inside `scripts` folder

The application uses Flyway for managing database migrations. To set up the database:

1. Update the `spring.flyway.user` and `spring.flyway.password` properties in the application's properties file to match your MySQL setup.
2. Flyway will automatically apply the database migrations when the application starts up. Migrations are located in the `resources/db/migration` directory and follow the naming convention `V<VERSION>__<NAME>.sql`.

## Running Tests

The application contains unit tests for domain entities and repositories. 