package com.example.lab1practice.api;

import com.example.lab1practice.Domain.Course;
import com.example.lab1practice.Repository.CourseRepository;
import com.example.lab1practice.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
  private final CourseService service;

  // Inject Course Service (IoC + DI)
    public CourseController(CourseService service){
        this.service=service;
    }

    @GetMapping
    public List<Course>getAllCourses(){
        return service.getAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return service.createCourse(course);

    }
}
