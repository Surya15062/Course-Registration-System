# 📚 Course Registration System

A simple full-stack Course Registration System built using **Spring Boot, Spring Data JPA, and MySQL**.
This project demonstrates backend development concepts such as REST APIs, database integration, and MVC architecture.

---

## 🚀 Features

* View available courses
* Register for a course
* View enrolled students
* Store course and student data in MySQL database
* Simple HTML + JavaScript frontend for testing API connectivity

---

## 🛠 Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Data JPA
* REST API
* MySQL

**Frontend**

* HTML
* CSS
* JavaScript (Fetch API)

---

## 📂 Project Structure

Course-Registration-System
│
├── controller
│ └── CourseController
│
├── service
│ └── CourseService
│
├── repository
│ ├── CourseRepo
│ └── CourseRegistrationRepo
│
├── model
│ ├── Course
│ └── CourseRegistration
│
└── resources
└── application.properties

---

## 🔗 API Endpoints

### Get Available Courses

GET /courses

Returns the list of all available courses.

---

### Register for a Course

POST /courses/register

Parameters:

studentName
studentEmail
courseName

Example response:

❤️ Thank you Surya! You have successfully registered for Java Programming 📚

---

### View Enrolled Students

GET /courses/enrolled

Returns all registered students with their course details.

---

## 🗄 Database

MySQL is used to store:

* Course information
* Student registration details

Example Tables:

**Course**

* course_id
* course_name
* course_description
* trainer_name
* course_duration
* course_category

**CourseRegistration**

* registration_id
* student_name
* student_email
* course_name
* status

---

## 🎨 Frontend

A simple frontend is created using **HTML, CSS, and JavaScript** to test the APIs.

Pages included:

* Register Course
* Available Courses
* Enrolled Students

---

## 🤖 Note

The frontend UI was enhanced using **AI tools (Gemini)** to improve layout and styling.
The primary focus of this project is **backend development using Spring Boot and MySQL**.

---

## 📌 Future Improvements

* Implement frontend using React or Angular
* Add authentication (Spring Security)
* Add course capacity and validation
* Improve UI/UX design

---

## 👨‍💻 Author

Surya
Java Backend Development 
B.Tech – Information Technology

GitHub: https://github.com/Surya15062
LinkedIn: https://linkedin.com/in/s-surya-6b9b6329b

---
