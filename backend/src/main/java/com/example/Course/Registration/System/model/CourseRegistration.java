package com.example.Course.Registration.System.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "course_registration")
public class CourseRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int registrationId;

        private String studentName;
        private String studentEmail;
        private String courseName;
        private String status;

    public CourseRegistration(String studentName, String studentEmail, String courseName, String status) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.courseName = courseName;
        this.status = status;
    }

    public CourseRegistration() {
    }

}
