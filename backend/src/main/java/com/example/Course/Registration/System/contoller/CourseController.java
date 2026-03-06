package com.example.Course.Registration.System.contoller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistration;
import com.example.Course.Registration.System.service.CourseService;
import org.hibernate.boot.jaxb.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistration> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String registerCourse(@RequestParam("studentName") String studentName,
                                 @RequestParam("studentEmail") String studentEmail,
                                 @RequestParam("courseName") String courseName) {

        courseService.registerCourse(studentName, studentEmail, courseName);

        return "❤️ Thank you " + studentName + "! You have successfully registered for " + courseName + " 📚";
    }
}
