# ScissorsStonePaperBackend

This project was built with Java 19, Springboot 3.0.4 and for the database PostgreSQL V15.

## Run the application

You can run the application locally. Before doing so, you need to create a PostgreSQL database and set the following properties
in this file -> src/main/resources/application.properties :

spring.datasource.url = jdbc:postgresql://localhost:5432/#####

spring.datasource.username = #####

spring.datasource.password = #####

After that you start the Angular frontend application ('ScissorsStonePaperFrontend') and start playing the game

## Running unit tests

You can run a JUnit test -> src/test/java/com/ys/scissorsstonepaperbackend/ChoiceTest.java
