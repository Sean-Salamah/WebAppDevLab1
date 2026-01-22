package com.example.lab1practice.api;

import com.example.lab1practice.Domain.Course;
import com.example.lab1practice.Repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
   private final CourseRepository repo;
   public CourseController(CourseRepository repo){this.repo = repo; }

    @GetMapping
    public List<Course> all(){return repo.findAll();}

    @PostMapping
    public Course create(@RequestBody Course c){return repo.save(c);}

}
