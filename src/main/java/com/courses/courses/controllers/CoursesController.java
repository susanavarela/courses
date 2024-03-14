package com.courses.courses.controllers;

import com.courses.courses.dtos.CourseDTO;
import com.courses.courses.entities.Course;
import com.courses.courses.servicies.CoursesService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/courses")
public class CoursesController {


    private final CoursesService coursesService;

    @PostMapping("/create/courses")
    public ResponseEntity<CourseDTO> CreateCourse(@RequestBody CourseDTO courseDTO) throws Exception {

        return ResponseEntity.ok(coursesService.createCours(courseDTO));
    }

    @GetMapping()
    public ResponseEntity<?> getAllCourses() throws Exception {
        try {
            return ResponseEntity.ok(coursesService.findAll());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
