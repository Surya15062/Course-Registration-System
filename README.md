# 📚 Course Registration System

A simple **Full Stack Course Registration System** built using **Spring Boot, Spring Data JPA, and MySQL** for backend development, with a lightweight **HTML, CSS, and JavaScript frontend** for interacting with APIs.

This project mainly focuses on **backend development and REST API design**, while the frontend is used only for testing and demonstration purposes.

---

## 🚀 Features

* View available courses
* Register for a course
* View enrolled students
* Store course and student registration data in MySQL
* REST API based backend
* Simple frontend to interact with backend APIs

---

## 🛠 Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* REST APIs
* MySQL
* Maven

### Frontend

* HTML
* CSS
* JavaScript
* Fetch API

---

## 📂 Project Structure

```
Course-Registration-System
│
├── backend
│   └── Spring Boot Application
│       ├── controller
│       ├── service
│       ├── repository
│       ├── model
│       └── resources
│
├── frontend
│   ├── register.html
│   ├── available-courses.html
│   ├── enrolled-students.html
│   └── script.js
│
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## 🔗 API Endpoints

### Get Available Courses

```
GET /courses
```

Returns a list of all available courses.

---

### Register for a Course

```
POST /courses/register
```

Parameters:

* studentName
* studentEmail
* courseName

Example response:

```
❤️ Thank you Surya! You have successfully registered for Java Programming 📚
```

---

### View Enrolled Students

```
GET /courses/enrolled
```

Returns all students who registered for courses.

---

## 🗄 Database

MySQL is used to store:

### Course Table

* course_id
* course_name
* course_description
* trainer_name
* course_duration
* course_category

### Course Registration Table

* registration_id
* student_name
* student_email
* course_name
* status

---

## 🎨 Frontend

A simple frontend is built using **HTML, CSS, and JavaScript** to interact with backend APIs.

Pages included:

* Register Course
* Available Courses
* Enrolled Students

---

## 🤖 Note

The frontend UI was enhanced using **AI tools (Gemini)** to improve layout and styling.

The primary focus of this project is **backend development using Spring Boot and MySQL**, including API design, database integration, and business logic.

---

## 🔮 Future Improvements

* Add authentication using Spring Security
* Implement course capacity validation
* Improve UI using React or Angular
* Add pagination and search functionality
* Deploy backend using Docker or cloud services

---

## 👨‍💻 Author

**Surya**

**Java Backend Development**

B.Tech – Information Technology

GitHub: https://github.com/Surya15062
LinkedIn: https://linkedin.com/in/s-surya-6b9b6329b

---
