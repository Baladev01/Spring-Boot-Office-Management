# Office Management System

## 📌 Project Overview

The Office Management System is a Spring Boot REST API project developed to manage employees, departments, projects, and ID cards in an organization. This project demonstrates CRUD operations, JPA relationships, DTOs, pagination, sorting, enums, and Swagger API documentation.

---

## 🚀 Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
* Swagger (OpenAPI)
* REST API

---

## 📂 Project Structure

```
src/main/java/com/office
│
├── controller
├── dto
├── entity
├── enums
├── repository
├── service
└── OfficeApplication.java
```

---

## 📚 Features

* Employee Management
* Department Management
* Project Management
* ID Card Management
* CRUD Operations
* DTO (Request & Response)
* Pagination
* Sorting
* Swagger Documentation
* Enum Mapping
* JPA Relationships

---

## 🗄 Database Tables

* department
* employee
* project
* employee_project
* id_card

---

## 🔗 JPA Relationships

### One-to-Many

* One Department can have many Employees.

### Many-to-One

* Many Employees belong to one Department.

### One-to-One

* One Employee has one ID Card.

### Many-to-Many

* Many Employees can work on many Projects.

---

## 📌 Enum

### Employee Status

* ACTIVE
* INACTIVE
* ON_LEAVE

### Project Status

* NOT_STARTED
* IN_PROGRESS
* COMPLETED

---

## 📌 REST APIs

### Department APIs

* POST /department/save
* GET /department/all
* GET /department/{id}
* PUT /department/{id}
* DELETE /department/{id}

### Employee APIs

* POST /employee/save
* GET /employee/all
* GET /employee/{id}
* PUT /employee/{id}
* DELETE /employee/{id}
* GET /employee/page
* GET /employee/sort
* GET /employee/sortdesc

### Project APIs

* POST /project/save
* GET /project/all
* GET /project/{id}
* PUT /project/{id}
* DELETE /project/{id}

### ID Card APIs

* POST /idcard/save
* GET /idcard/all
* GET /idcard/{id}
* DELETE /idcard/{id}

---

## 📖 DTO Usage

### Request DTO

Used to receive client request data.

Examples:

* EmployeeRequestDTO
* DepartmentRequestDTO
* ProjectRequestDTO
* IDCardRequestDTO

### Response DTO

Used to send customized responses to the client.

Examples:

* EmployeeResponseDTO
* DepartmentResponseDTO
* ProjectResponseDTO
* IDCardResponseDTO

---

## 📄 API Documentation

Swagger UI is available after running the project.

```
http://localhost:8080/swagger-ui/index.html
```

---

## ▶️ How to Run

1. Clone the repository.
2. Create a MySQL database.
3. Update database configuration in `application.properties`.
4. Run the Spring Boot application.
5. Open Swagger UI.
6. Test the REST APIs.

---

## 🎯 Learning Concepts

This project covers:

* Spring Boot
* REST APIs
* CRUD Operations
* DTO Pattern
* Entity Mapping
* JPA Relationships
* Enum Mapping
* Pagination
* Sorting
* Lombok
* Repository Pattern
* Service Layer
* Controller Layer
* MySQL Integration
* Swagger Documentation

---

## 👨‍💻 Author

**C. Balamurugan**

Spring Boot | Java Backend Developer
