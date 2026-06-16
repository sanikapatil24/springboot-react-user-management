# User Management System

A full-stack User Management System built using **Spring Boot**, **React.js**, **MySQL**, and **REST APIs**. The application provides complete CRUD (Create, Read, Update, Delete) functionality for managing user records through a responsive and user-friendly interface.

## Features

* Add new users
* View all users
* Update existing user details
* Delete users
* Responsive user interface
* RESTful API integration
* MySQL database connectivity
* Exception handling and validation

## Tech Stack

### Frontend

* React.js
* React Router
* Axios
* Bootstrap

### Backend

* Spring Boot
* Spring Data JPA
* Hibernate
* REST API

### Database

* MySQL

### Tools & Technologies

* Java 17+
* Maven
* Git & GitHub
* VS Code
* Postman

## Project Architecture

User Interface (React)
↓
REST API (Spring Boot)
↓
Service Layer
↓
Repository Layer (JPA)
↓
MySQL Database

## API Endpoints

| Method | Endpoint   | Description         |
| ------ | ---------- | ------------------- |
| GET    | /users     | Get all users       |
| GET    | /user/{id} | Get user by ID      |
| POST   | /user      | Add a new user      |
| PUT    | /user/{id} | Update user details |
| DELETE | /user/{id} | Delete user         |

## Installation & Setup

### Clone Repository

```bash
git clone https://github.com/sanikapatil24/springboot-react-user-management.git
```

### Backend Setup

1. Open the Spring Boot project.
2. Configure MySQL database in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

3. Run the Spring Boot application.

### Frontend Setup

```bash
cd user-frontend
npm install
npm start
```

The application will start at:

```text
http://localhost:3000
```

Backend API:

```text
http://localhost:8080
```

## Screenshots

### Home Page
<img width="958" height="482" alt="image" src="https://github.com/user-attachments/assets/9fb32e4d-ab85-4bab-a6ea-5483bb8a2d69" />

### Add User

<img width="958" height="482" alt="image" src="https://github.com/user-attachments/assets/c3783457-4d1f-4920-8929-0dfe1170a699" />


### User List

<img width="960" height="481" alt="image" src="https://github.com/user-attachments/assets/4e10d35b-3e78-4f74-9c75-79fd3b9f88d8" />


## Future Enhancements

* User Authentication & Authorization
* JWT Security
* Search and Filter Functionality
* Pagination
* Role-Based Access Control
* Docker Deployment
* Cloud Deployment (AWS)

## Learning Outcomes

Through this project, I gained hands-on experience with:

* Building REST APIs using Spring Boot
* React Component Development
* State Management in React
* Database Integration with MySQL
* CRUD Operations
* Git and GitHub Version Control
* Full Stack Application Development

## Author

**Sanika Patil**

Software Engineering Student | Java Full Stack Developer

GitHub: https://github.com/sanikapatil24
