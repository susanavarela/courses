package com.courses.courses.mappers;

import com.courses.courses.dtos.CategoryDTO;
import com.courses.courses.dtos.CourseDTO;
import com.courses.courses.dtos.PdfDTO;
import com.courses.courses.entities.Category;
import com.courses.courses.entities.Course;
import com.courses.courses.entities.Pdf;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoursMapper{

    public Course convertCoursDTOToCours(CourseDTO courseDTO, Category category, List<Pdf> pdfs) {
        return Course.builder()
                .category(category)
                .pdfs(pdfs)
                .link(courseDTO.getLink())
                .name(courseDTO.getName())
                .description(courseDTO.getDescription())
                .build();
    }

    public CourseDTO convertCoursToCoursDTO(Course course, CategoryDTO categoryDTO, List<PdfDTO> pdfDTO) {
        return CourseDTO.builder()
                .category(categoryDTO)
                .pdfs(pdfDTO)
                .link(course.getLink())
                .name(course.getName())
                .description(course.getDescription())
                .build();
    }
}
