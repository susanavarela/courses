package com.courses.courses.controllers;

import com.courses.courses.constants.ControllerConstants;
import com.courses.courses.dtos.CourseDTO;
import com.courses.courses.servicies.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.courses.courses.constants.ControllerConstants.CREATION_COURSE;


@RequiredArgsConstructor
@RestController
@RequestMapping(ControllerConstants.CONTROLLER_BASE_PATH)
public class CoursesController {


    private final CoursesService coursesService;

    @PostMapping(CREATION_COURSE)
    public ResponseEntity<Object> CreateCourse(@RequestBody CourseDTO courseDTO) throws Exception {

        return ResponseEntity.ok(coursesService.createCours(courseDTO));
    }

    @GetMapping()
    public ResponseEntity<Object> getAllCourses() {
        try {
            return ResponseEntity.ok(coursesService.findAll());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
