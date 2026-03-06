package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    private String courseId;
    private String courseName;
    private String courseDescription;
    private String trainerName;
    private String courseDuration;
    private String courseCategory;

}
