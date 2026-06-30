<div align="center">

# 🏢 Office Management System

### 🚀 Enterprise-Level Spring Boot REST API

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring_Security-6.x-success?style=for-the-badge&logo=springsecurity)
![JWT](https://img.shields.io/badge/JWT-Authentication-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate)
![Swagger](https://img.shields.io/badge/Swagger-API-green?style=for-the-badge&logo=swagger)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

</div>

---

# 📖 Project Overview

The **Office Management System** is a complete **Spring Boot REST API** application designed to manage employees, departments, projects, ID cards, and administrator authentication.

The project demonstrates real-world backend development concepts including **JWT Authentication**, **Spring Security**, **JPA Relationships**, **DTO Pattern**, **Pagination**, **Sorting**, **Swagger Documentation**, and **MySQL Integration**.

---

# ✨ Key Features

## 👨‍💼 Admin Module

- 🔐 Admin Registration
- 🔑 Secure Login
- 🛡 JWT Authentication
- 🔒 BCrypt Password Encryption

---

## 👨‍💻 Employee Module

- Add Employee
- Update Employee
- Delete Employee
- View Employee
- Pagination
- Sorting
- Enum Status

---

## 🏢 Department Module

- Create Department
- Update Department
- Delete Department
- View Department
- Department-wise Employees

---

## 📁 Project Module

- Add Project
- Assign Employees
- Update Project
- Delete Project
- Project Status

---

## 🪪 ID Card Module

- Generate ID Card
- One-to-One Mapping
- Employee-ID Card Relationship

---

# 🛠 Technologies Used

| Category | Technology |
|-----------|------------|
| Language | Java 17 |
| Framework | Spring Boot |
| Security | Spring Security |
| Authentication | JWT |
| Password Encryption | BCrypt |
| ORM | Hibernate |
| Database | MySQL |
| API | REST API |
| Build Tool | Maven |
| Documentation | Swagger |
| Boilerplate Reduction | Lombok |

---

# 📂 Project Structure

```
src
│
├── config
│
├── controller
│
├── service
│
├── repository
│
├── entity
│
├── dto
│
├── enums
│
├── util
│
├── filter
│
├── common
│
└── OfficeApplication
```

---

# 🗄 Database Tables

```
Admin

Department

Employee

Project

Employee_Project

ID_Card
```

---

# 🔗 Entity Relationships

## 🔹 One-to-Many

```
Department
      │
      │
      ▼
Employees
```

One Department ➜ Many Employees

---

## 🔹 Many-to-One

```
Employees
      │
      │
      ▼
Department
```

Many Employees ➜ One Department

---

## 🔹 One-to-One

```
Employee
     │
     ▼
 ID Card
```

One Employee ➜ One ID Card

---

## 🔹 Many-to-Many

```
Employee

    ▲

    │

Project
```

Many Employees ↔ Many Projects

---

# 🔐 Authentication Flow

```
Admin

   │

Signup/Login

   │

   ▼

Spring Security

   │

Authenticate User

   │

   ▼

Generate JWT

   │

   ▼

Client Stores JWT

   │

   ▼

Authorization

Bearer Token

   │

   ▼

JwtFilter

   │

Extract Token

   │

Validate Token

   │

Extract Username

   │

   ▼

SecurityContextHolder

   │

   ▼

Protected REST APIs
```

---

# 🎫 JWT Structure

```
Header

↓

Payload

↓

Signature
```

Payload Example

```json
{
  "sub":"admin",
  "iat":1751286600,
  "exp":1751290200
}
```

---

# 📑 REST APIs

## 🔐 Authentication

```
POST   /admin/signup

POST   /admin/login
```

---

## 👨‍💻 Employee APIs

```
POST   /employee/save

GET    /employee/all

GET    /employee/{id}

PUT    /employee/{id}

DELETE /employee/{id}

GET    /employee/page

GET    /employee/sort

GET    /employee/sortdesc
```

---

## 🏢 Department APIs

```
POST

GET

PUT

DELETE
```

---

## 📁 Project APIs

```
POST

GET

PUT

DELETE
```

---

## 🪪 ID Card APIs

```
POST

GET

DELETE
```

---

# 📚 DTO Pattern

### Request DTO

✔ EmployeeRequestDTO

✔ DepartmentRequestDTO

✔ ProjectRequestDTO

✔ IDCardRequestDTO

✔ AdminRequestDTO

✔ LoginRequestDTO

---

### Response DTO

✔ EmployeeResponseDTO

✔ DepartmentResponseDTO

✔ ProjectResponseDTO

✔ IDCardResponseDTO

✔ AdminResponseDTO

✔ LoginResponseDTO

---

# 📦 Generic Response

```
ApiResponse<T>

↓

Status

↓

Message

↓

Data
```

---

# 📄 Pagination Response

```
Content

Total Pages

Total Elements

Current Page

Page Size

First

Last
```

---

# 📊 Enum Mapping

## Employee Status

```
ACTIVE

INACTIVE

ON_LEAVE
```

---

## Project Status

```
NOT_STARTED

IN_PROGRESS

COMPLETED
```

---

# 📖 Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

# ▶️ How To Run

### Clone Repository

```bash
git clone <repository-url>
```

### Open Project

```
IntelliJ IDEA
```

### Configure Database

```
application.properties
```

### Run

```
OfficeApplication.java
```

### Open Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

# 🎯 Learning Concepts

✅ Spring Boot

✅ Spring Security

✅ JWT Authentication

✅ BCrypt Password Encryption

✅ REST API

✅ CRUD Operations

✅ JPA Relationships

✅ One-To-One

✅ One-To-Many

✅ Many-To-One

✅ Many-To-Many

✅ DTO Pattern

✅ Generic API Response

✅ Pagination

✅ Sorting

✅ Enum Mapping

✅ Repository Pattern

✅ Service Layer

✅ Controller Layer

✅ MySQL

✅ Hibernate

✅ Swagger Documentation

---

# 🚀 Future Enhancements

- Refresh Token

- Role-Based Authorization

- Email Verification

- Forgot Password

- Docker

- Unit Testing

- OAuth2 Login

- Single Sign-On (SSO)

- Spring Boot Actuator

---

<div align="center">

# 👨‍💻 Author

## **C. Balamurugan**

### 🌟 Java Backend Developer

⭐ If you like this project, don't forget to **Star** the repository.

**Happy Coding 🚀**

</div>
