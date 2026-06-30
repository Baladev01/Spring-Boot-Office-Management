````markdown
<div align="center">

# 🏢 Office Management System

### 🚀 Enterprise-Level Spring Boot REST API Project

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring_Security-6.x-6DB33F?style=for-the-badge&logo=springsecurity)
![JWT](https://img.shields.io/badge/JWT-Authentication-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-Repository-success?style=for-the-badge)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-85EA2D?style=for-the-badge&logo=swagger)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)

### ⭐ Secure • Fast • Scalable • RESTful API ⭐

</div>

---

# 📖 About Project

The **Office Management System** is a complete **Spring Boot REST API** project developed to manage employees, departments, projects and ID cards in an organization.

This project demonstrates enterprise-level backend development concepts including:

- 🚀 Spring Boot
- 🔐 Spring Security
- 🎫 JWT Authentication
- 📦 Spring Data JPA
- 🛢 Hibernate ORM
- 🗄 MySQL Database
- 📑 DTO Pattern
- 🔗 JPA Relationships
- 📄 CRUD Operations
- 📃 Pagination
- 🔄 Sorting
- 📚 Swagger Documentation

---

# ✨ Project Features

## 👨‍💼 Admin Module

- ✅ Admin Registration
- ✅ Admin Login
- ✅ Secure Authentication
- ✅ JWT Token Generation

---

## 👨‍💻 Employee Module

- ✅ Add Employee
- ✅ Update Employee
- ✅ Delete Employee
- ✅ View Employee
- ✅ Employee Status
- ✅ Pagination
- ✅ Sorting

---

## 🏢 Department Module

- ✅ Create Department
- ✅ Update Department
- ✅ Delete Department
- ✅ View Department

---

## 📁 Project Module

- ✅ Create Project
- ✅ Update Project
- ✅ Delete Project
- ✅ Assign Employees
- ✅ Project Status

---

## 🪪 ID Card Module

- ✅ Create ID Card
- ✅ View ID Card
- ✅ Delete ID Card

---

# 🛠 Technologies Used

| Technology | Description |
|------------|-------------|
| ☕ Java 17 | Programming Language |
| 🌱 Spring Boot | Backend Framework |
| 🔐 Spring Security | Security Framework |
| 🎫 JWT | Authentication |
| 🛢 Hibernate | ORM |
| 📦 Spring Data JPA | Repository Layer |
| 🗄 MySQL | Database |
| 📄 Swagger | API Documentation |
| 📚 Lombok | Boilerplate Reduction |
| 🔨 Maven | Build Tool |

---

# 📂 Project Structure

```text
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
├── filter
│
├── util
│
└── OfficeApplication.java
```

---

# 🗄 Database Tables

```text
📦 ADMIN

📦 DEPARTMENT

📦 EMPLOYEE

📦 PROJECT

📦 EMPLOYEE_PROJECT

📦 ID_CARD
```

---

# 🔗 Entity Relationship

## 🔵 One-To-Many

```text
Department
     │
     ▼
Employee
Employee
Employee
```

---

## 🟢 Many-To-One

```text
Employee
     │
     ▼
Department
```

---

## 🟣 One-To-One

```text
Employee
     ↕
 ID Card
```

---

## 🟠 Many-To-Many

```text
Employee
    ↕
 Project

Employee
    ↕
 Project
```

---

# 📌 Employee Status

```text
🟢 ACTIVE

🟡 ON_LEAVE

🔴 INACTIVE
```

---

# 📌 Project Status

```text
⚪ NOT_STARTED

🟡 IN_PROGRESS

🟢 COMPLETED
```

---

# 🔐 JWT Authentication Flow

```text
              USER
                │
                ▼
      Username + Password
                │
                ▼
         Login API
                │
                ▼
      Spring Security
                │
                ▼
Authenticate Username & Password
                │
                ▼
      Generate JWT Token
                │
                ▼
 Client Stores JWT Token
                │
                ▼
Authorization : Bearer <JWT>
                │
                ▼
          JwtFilter
                │
                ▼
        Extract Token
                │
                ▼
          JwtUtil
                │
     Verify Signature
                │
     Extract Username
                │
 Validate Expiration
                │
                ▼
 UserDetailsService
                │
                ▼
 Validate Username
                │
                ▼
UsernamePasswordAuthenticationToken
                │
                ▼
SecurityContextHolder
                │
                ▼
     Protected APIs
```

---

# 🎫 JWT Structure

```text
Header

↓

Payload

↓

Signature
```

Example

```text
eyJhbGciOiJIUzI1NiJ9

.

eyJzdWIiOiJhZG1pbiJ9

.

Signature
```

---

# 🌐 REST APIs

## 👨‍💼 Admin APIs

```http
POST   /admin/signup

POST   /admin/login
```

---

## 👨‍💻 Employee APIs

```http
POST

GET

PUT

DELETE

Pagination

Sorting
```

---

## 🏢 Department APIs

```http
POST

GET

PUT

DELETE
```

---

## 📁 Project APIs

```http
POST

GET

PUT

DELETE
```

---

## 🪪 ID Card APIs

```http
POST

GET

DELETE
```

---

# 📦 DTO Flow

```text
Client

↓

Request DTO

↓

Entity

↓

Repository

↓

Database

↓

Entity

↓

Response DTO

↓

Client
```

---

# 🔐 Security Features

- ✅ Spring Security
- ✅ JWT Authentication
- ✅ Stateless Authentication
- ✅ Authentication
- ✅ Authorization
- ✅ Protected REST APIs
- ✅ BCrypt Password Encryption
- ✅ UserDetailsService
- ✅ SecurityContextHolder

---

# 📄 Swagger

```text
http://localhost:8080/swagger-ui/index.html
```

---

# ▶️ How To Run

```text
1️⃣ Clone Repository

2️⃣ Open Project

3️⃣ Create MySQL Database

4️⃣ Configure application.properties

5️⃣ Run Spring Boot Application

6️⃣ Open Swagger UI

7️⃣ Test REST APIs
```

---

# 📚 Learning Concepts

- ✅ Java
- ✅ Spring Boot
- ✅ Spring Security
- ✅ JWT Authentication
- ✅ REST API
- ✅ CRUD Operations
- ✅ DTO Pattern
- ✅ Entity Mapping
- ✅ JPA Relationships
- ✅ One-To-One
- ✅ One-To-Many
- ✅ Many-To-One
- ✅ Many-To-Many
- ✅ Pagination
- ✅ Sorting
- ✅ MySQL
- ✅ Hibernate
- ✅ Swagger
- ✅ Repository Pattern
- ✅ Service Layer
- ✅ Controller Layer

---

# 🚀 Future Enhancements

⭐ Refresh Token

⭐ Role-Based Authorization

⭐ Email Verification

⭐ Forgot Password

⭐ Docker

⭐ Unit Testing

⭐ Logging

⭐ Global Exception Handling

⭐ CI/CD Pipeline

⭐ Spring Cloud

⭐ Microservices

⭐ Kubernetes

---

# 📊 Project Highlights

🔥 Enterprise-Level Spring Boot Project

🔥 Layered Architecture

🔥 RESTful APIs

🔥 DTO Pattern

🔥 JWT Authentication

🔥 Spring Security

🔥 JPA Relationships

🔥 Pagination & Sorting

🔥 Swagger Integration

🔥 Clean Code

🔥 Best Practices

---

# 🤝 Connect With Me

### 👨‍💻 C. Balamurugan

💻 Java Backend Developer

🌱 Spring Boot Developer

📚 Passionate About Learning New Technologies

⭐ GitHub: https://github.com/Baladev01

---

<div align="center">

# 🌟 Thank You For Visiting 🌟

### ⭐ If you like this project, please give it a Star ⭐

### 🚀 Happy Coding 🚀

❤️ Made with Java & Spring Boot ❤️

</div>
````
