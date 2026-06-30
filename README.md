````markdown
# 🚀 Office Management System

<div align="center">

# 🏢 Office Management System

### 🌟 Enterprise-Level Spring Boot REST API Project

<img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" />
<img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot" />
<img src="https://img.shields.io/badge/Spring%20Security-6.x-success?style=for-the-badge&logo=springsecurity" />
<img src="https://img.shields.io/badge/JWT-Authentication-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql" />
<img src="https://img.shields.io/badge/Hibernate-ORM-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven" />
<img src="https://img.shields.io/badge/Swagger-API-green?style=for-the-badge&logo=swagger" />

### ⭐ Secure • Fast • Scalable • RESTful ⭐

</div>

---

# 📖 About The Project

The **Office Management System** is a complete **Spring Boot REST API** project designed to manage an organization's daily operations.

This project demonstrates enterprise-level backend development concepts including:

✨ Spring Boot

✨ Spring Security

✨ JWT Authentication

✨ CRUD Operations

✨ DTO Pattern

✨ JPA Relationships

✨ Pagination

✨ Sorting

✨ Swagger Documentation

✨ MySQL Integration

---

# ✨ Key Features

## 👨‍💼 Admin Module

✅ Admin Registration

✅ Admin Login

✅ Secure Authentication

---

## 👨‍💻 Employee Module

✅ Add Employee

✅ Update Employee

✅ Delete Employee

✅ View Employee

✅ Employee Status

---

## 🏢 Department Module

✅ Add Department

✅ Update Department

✅ Delete Department

✅ View Department

---

## 📁 Project Module

✅ Add Project

✅ Update Project

✅ Delete Project

✅ Assign Employees

---

## 🪪 ID Card Module

✅ Create ID Card

✅ View ID Card

✅ Delete ID Card

---

## 🔐 Security Module

✅ Spring Security

✅ JWT Authentication

✅ Protected APIs

✅ Password Encryption

✅ Authentication & Authorization

---

# 🛠️ Technologies Used

| Technology | Description |
|------------|-------------|
| ☕ Java 17 | Programming Language |
| 🌱 Spring Boot | Backend Framework |
| 🔐 Spring Security | Authentication |
| 🎫 JWT | Token Authentication |
| 🗄 MySQL | Database |
| 🛢 Hibernate | ORM |
| 📦 Spring Data JPA | Data Access |
| 📄 Swagger | API Documentation |
| 📚 Lombok | Boilerplate Reduction |
| 🔨 Maven | Dependency Management |

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
├── util
│
├── filter
│
└── OfficeApplication.java
```

---

# 🗄 Database Tables

```
📦 ADMIN

📦 DEPARTMENT

📦 EMPLOYEE

📦 PROJECT

📦 EMPLOYEE_PROJECT

📦 ID_CARD
```

---

# 🔗 JPA Relationships

## 🔵 One To Many

```
Department
      │
      │
      ▼
Employee
Employee
Employee
```

---

## 🟢 Many To One

```
Employee

↓

Department
```

---

## 🟣 One To One

```
Employee

↔

ID Card
```

---

## 🟠 Many To Many

```
Employee

↕
Project

Employee

↕
Project
```

---

# 📌 Employee Status

```
🟢 ACTIVE

🔴 INACTIVE

🟡 ON_LEAVE
```

---

# 📌 Project Status

```
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
          Login REST API
                   │
                   ▼
         Spring Security
                   │
                   ▼
         Authenticate User
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
                   ▼
          Verify Signature
                   │
                   ▼
         Extract Username
                   │
                   ▼
     UserDetailsService
                   │
                   ▼
         Validate Token
                   │
                   ▼
SecurityContextHolder
                   │
                   ▼
          Protected APIs
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

Example

```
eyJhbGciOiJIUzI1NiJ9

.

eyJzdWIiOiJiYWxhIn0

.

Signature
```

---

# 🌐 REST APIs

# 👨 Admin

```
POST   /admin/signup

POST   /admin/login
```

---

# 🏢 Department

```
POST

GET

PUT

DELETE
```

---

# 👨‍💻 Employee

```
POST

GET

PUT

DELETE

Pagination

Sorting
```

---

# 📁 Project

```
POST

GET

PUT

DELETE
```

---

# 🪪 ID Card

```
POST

GET

DELETE
```

---

# 📖 DTO Pattern

## 📥 Request DTO

```
Client

↓

Request DTO

↓

Entity
```

---

## 📤 Response DTO

```
Entity

↓

Response DTO

↓

Client
```

---

# 🔐 Security Features

✅ Spring Security

✅ JWT Authentication

✅ Stateless Authentication

✅ Authentication

✅ Authorization

✅ Protected APIs

✅ Password Encryption

✅ UserDetailsService

✅ SecurityContextHolder

---

# 📄 Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

# ▶️ How To Run

```text
1️⃣ Clone Repository

2️⃣ Open Project

3️⃣ Create MySQL Database

4️⃣ Configure application.properties

5️⃣ Run Spring Boot

6️⃣ Open Swagger

7️⃣ Test APIs
```

---

# 🎯 Learning Concepts

✅ Java

✅ Spring Boot

✅ Spring Security

✅ JWT Authentication

✅ REST API

✅ CRUD Operations

✅ DTO Pattern

✅ Entity Mapping

✅ JPA Relationships

✅ One-To-One

✅ One-To-Many

✅ Many-To-One

✅ Many-To-Many

✅ Pagination

✅ Sorting

✅ Swagger

✅ MySQL

✅ Hibernate

✅ Repository Pattern

✅ Service Layer

✅ Controller Layer

---

# 🚀 Future Enhancements

⭐ Refresh Token

⭐ Role Based Authentication

⭐ File Upload

⭐ Email Verification

⭐ Forgot Password

⭐ Docker

⭐ Unit Testing

⭐ Logging

⭐ Global Exception Handling

⭐ CI/CD

⭐ Microservices

⭐ Spring Cloud

⭐ Kubernetes

---

# 📊 Project Highlights

🔥 Enterprise Level REST API

🔥 Clean Architecture

🔥 Layered Architecture

🔥 DTO Pattern

🔥 Secure Authentication

🔥 Database Relationships

🔥 API Documentation

🔥 Best Coding Practices

---

# 🤝 Connect With Me

👨‍💻 **C. Balamurugan**

🌟 Java Backend Developer

💻 Spring Boot Enthusiast

📚 Always Learning New Technologies

---

<div align="center">

# ⭐ If you like this project...

## 🌟 Please Star this Repository 🌟

### ❤️ Thank You For Visiting ❤️

🚀 Happy Coding 🚀

</div>
````
