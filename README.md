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
![Docker](https://img.shields.io/badge/Docker-Ready-2496ED?style=for-the-badge&logo=docker)

### ⭐ Secure • Fast • Scalable • RESTful API ⭐

</div>

---

## 📖 Table of Contents

- [✨ About Project](#-about-project)
- [🚀 Features](#-project-features)
- [🛠 Tech Stack](#-technologies-used)
- [🏗 Architecture](#-project-architecture)
- [📂 Project Structure](#-project-structure)
- [🗄 Database Design](#-database-tables)
- [🔗 Entity Relationships](#-entity-relationship)
- [🔐 JWT Authentication](#-jwt-authentication-flow)
- [🌐 REST APIs](#-rest-apis)
- [📦 DTO Flow](#-dto-flow)
- [📊 ER Diagram](#-er-diagram)
- [⚙️ Setup Guide](#-how-to-run)
- [📚 Learning Concepts](#-learning-concepts)
- [🚀 Future Enhancements](#-future-enhancements)
- [🤝 Connect](#-connect-with-me)

---

## ✨ About Project

<div align="center">

### 🎯 **A Complete Enterprise-Grade Backend Solution**

</div>

The **Office Management System** is a production-ready Spring Boot REST API that demonstrates **real-world enterprise application development**. This project serves as a comprehensive guide to building secure, scalable, and maintainable backend systems using modern Java technologies.

### 💡 Key Highlights

<table>
<tr>
<td>

**🎯 Core Features**
- Complete CRUD operations
- JWT authentication
- Role-based access
- Pagination & sorting
- File upload support

</td>
<td>

**🏗️ Architecture**
- Layered architecture
- DTO pattern
- Repository pattern
- Service layer
- Controller layer

</td>
</tr>
<tr>
<td>

**🔒 Security**
- Spring Security
- BCrypt encryption
- JWT tokens
- Stateless sessions
- CORS configuration

</td>
<td>

**📊 Database**
- MySQL 8.0
- Hibernate ORM
- JPA relationships
- Cascade operations
- Lazy/Eager loading

</td>
</tr>
</table>

---

## 🚀 Project Features

<div align="center">

### 📋 **Complete Module Breakdown**

</div>

### 👨💼 **Admin Module**
```mermaid
graph LR
    A[Admin] --> B[Signup]
    A --> C[Login]
    A --> D[JWT Token]
    C --> E[Authentication]
    E --> F[Authorization]
