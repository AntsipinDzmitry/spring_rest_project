# Spring Rest Hibernate Application
<p align="center">
      <img src="https://github.com/AntsipinDzmitry/spring_rest_project/blob/master/.idea/rest.png" alt="Project Logo" width="520">
</p>

## Spring Rest Hibernate


Application project with creating a database control and displaying information in the JSON-format.

## The main goals of the project:

*  The practice of creating an application project using REST API.
* Implementation of CRUD-operations in the database without using JSP
* Studying possible options for implementing an application using "the best practice"

## Frameworks and tools

* `IDE`: IntelliJ IDEA 2022.3.2 with JDK19
* `Backend`: Spring MVC 5.3.24  Hibernate 5.4.22 (Configured by Java code + annotations)
* `Database` mySQL
* `Web Server` Apache TomCat9
* `Build tool` Maven
* `Others` C3P0(Connection pool), Javax.servlet-api, Jackson-databind, Postman

## About

*  The structure of interaction between project entities is as follows:

<p align="center">
      <img src="https://github.com/AntsipinDzmitry/spring_rest_project/blob/master/.idea/RestStructure.png" alt="Project Logo" width="330">
</p>

*  I did not use spring boot in the project for a deeper dive into the practice of writing code and additional understanding of the internal processes of interaction between parts of the application
*  the process of regulating and managing transactions is outsourced to a transaction manager
*  When writing the application, I adhered to the following generally accepted standards:
- to get all employees and a specific employee, `GET HTTP-method` was used
- to add an employee to the database, `POST HTTP-method` was used
- to change the information about the employee, `PUT HTTP-method` was used
- to delete information about the employee, `DELETE HTTP-method` was used

*  in the project I use the service class that implements the business logic and serves as an intermediary between the controller and the DAO
*  implemented the possibility of global exception handling by creating a ready-made exception to display an informative message to the user in case of incorrect input
