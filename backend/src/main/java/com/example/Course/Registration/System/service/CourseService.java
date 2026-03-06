package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistration;
import com.example.Course.Registration.System.repository.CourseRegistrationRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistrationRepo courseRegistrationRepo;



    public List<Course> availableCourses() {
       return courseRepo.findAll();
    }

    public List<CourseRegistration> enrolledStudents() {
        return courseRegistrationRepo.findAll();
    }

    public void registerCourse(String studentName, String studentEmail, String courseName) {
        CourseRegistration courseRegistration = new CourseRegistration(studentName, studentEmail, courseName, "✅ Registered");
        courseRegistrationRepo.save(courseRegistration);
    }
}
