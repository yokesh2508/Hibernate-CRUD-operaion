# Hibernate Student Management System

## Overview

The Hibernate Student Management System is a Java-based backend project developed to perform basic CRUD operations on student records using **Hibernate ORM** and **JPA**. The project demonstrates how Java objects can be mapped to relational database tables and how database operations can be performed without writing direct SQL queries for every task.

The application manages student information such as **student ID, name, age, mobile number, and weight**. It uses Hibernate’s entity mapping and persistence mechanisms to store, retrieve, update, and delete records from the database.

This project was built to strengthen my understanding of **Hibernate, JPA annotations, ORM concepts, entity lifecycle, and Java database integration**.

---

## Objectives

* To understand the fundamentals of **Hibernate ORM**
* To perform **CRUD operations** using Hibernate and JPA
* To map Java classes to relational database tables using annotations
* To reduce manual SQL handling by using ORM concepts
* To build a simple backend application for managing student records

---

## Technologies Used

* **Java**
* **Hibernate ORM**
* **Jakarta Persistence API (JPA)**
* **PostgreSQL**
* **Maven** *(if used in your project setup)*

---

## Project Features

### 1. Student Entity Mapping

* Created a `Student` entity class using `@Entity`
* Defined `id` as the primary key using `@Id`
* Mapped student attributes such as name, age, mobile number, and weight to the database

### 2. Add / Persist Student Data

* Student records can be inserted into the database using Hibernate persistence operations

### 3. Retrieve Student Data

* Fetch student details from the database using the primary key with `EntityManager.find()`

### 4. Update Student Data

* Modify existing student records such as weight or other fields
* Merge updated entity data back into the database using `EntityManager.merge()`

### 5. Delete Student Data

* Remove student records from the database using `EntityManager.remove()`

### 6. Object-Oriented Data Handling

* Managed database records directly through Java objects instead of raw SQL operations

---

## Project Structure

```text
src/
│
├── hiber/
│   ├── Student.java
│   ├── FindData.java
│   ├── UpdateData.java
│   └── DeleteData.java
```

---

## Entity Description

### Student.java

The `Student` class represents the student entity in the application and is mapped to a database table using Hibernate.

#### Fields in Student Entity

| Field  | Data Type | Description                  |
| ------ | --------- | ---------------------------- |
| id     | int       | Unique Student ID            |
| name   | String    | Name of the student          |
| age    | int       | Age of the student           |
| mobile | long      | Mobile number of the student |
| weight | double    | Weight of the student        |

#### Annotations Used

* `@Entity` → Marks the class as a Hibernate entity
* `@Id` → Specifies the primary key of the entity

The class also includes:

* Constructors
* Getters and setters
* `toString()` method for displaying object details

---

## Functional Modules

### 1. FindData.java

This class is used to retrieve a student record from the database using the student ID.

#### Functionality:

* Creates `EntityManagerFactory`
* Creates `EntityManager`
* Uses `find(Student.class, id)` to fetch student details
* Displays the retrieved student object

This demonstrates **Read Operation** in CRUD.

---

### 2. UpdateData.java

This class is used to update an existing student record.

#### Functionality:

* Fetches the student using the given ID
* Updates the required field (such as weight)
* Begins a transaction
* Uses `merge()` to save updated data
* Commits the transaction

This demonstrates **Update Operation** in CRUD and transaction handling in Hibernate.

---

### 3. DeleteData.java

This class is used to delete an existing student record from the database.

#### Functionality:

* Fetches the student using the ID
* Begins a transaction
* Uses `remove()` to delete the entity
* Commits the transaction after successful deletion

This demonstrates **Delete Operation** in CRUD.

---

## Hibernate Concepts Used

This project helped in understanding the following Hibernate and JPA concepts:

* Entity Mapping
* Primary Key Mapping
* Persistence Unit Configuration
* EntityManagerFactory
* EntityManager
* EntityTransaction
* `find()` method
* `merge()` method
* `remove()` method
* ORM (Object Relational Mapping)
* JPA Annotations

---

## CRUD Operations Implemented

| Operation | Description                                  |
| --------- | -------------------------------------------- |
| Create    | Insert new student records into the database |
| Read      | Retrieve student details using ID            |
| Update    | Update existing student information          |
| Delete    | Remove student records from the database     |

---

## Learning Outcomes

Through this project, I gained practical experience in:

* Hibernate ORM framework
* JPA annotations and entity mapping
* Database persistence using Java objects
* CRUD operations using Hibernate
* Transaction management with `EntityTransaction`
* PostgreSQL integration with Java applications
* Backend development concepts in Java

This project gave me a strong understanding of how enterprise Java applications interact with databases using ORM tools instead of relying entirely on raw JDBC queries.

---

## Author

**Yokesh S**

Aspiring Java Developer interested in backend development, Java enterprise technologies, and database-driven applications.

GitHub: github.com/yokesh2508
