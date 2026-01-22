package com.example.lab1practice.service;

import com.example.lab1practice.Domain.Course;
import com.example.lab1practice.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
public class CourseService {
    private final CourseRepository repo;

    // Dependency Injection
    public CourseService(CourseRepository repo){
        this.repo = repo;
    }

    //Business Logic Methods
    public List<Course> getAllCourses(){
        return repo.findAll();
    }

    public Course createCourse(Course course){
        return repo.save(course);
    }
}
