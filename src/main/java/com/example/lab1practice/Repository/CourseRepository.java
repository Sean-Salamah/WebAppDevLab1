package com.example.lab1practice.Repository;


import com.example.lab1practice.Domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}

