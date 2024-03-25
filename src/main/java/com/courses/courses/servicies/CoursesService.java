package com.courses.courses.servicies;

import com.courses.courses.dtos.CourseDTO;

import java.util.List;

public interface CoursesService {
    CourseDTO createCours(CourseDTO courseDTO);

    List<CourseDTO> findAll();
}
