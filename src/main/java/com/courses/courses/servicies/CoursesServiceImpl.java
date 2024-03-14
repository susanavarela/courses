package com.courses.courses.servicies;

import com.courses.courses.dtos.CategoryDTO;
import com.courses.courses.dtos.CourseDTO;
import com.courses.courses.dtos.PdfDTO;
import com.courses.courses.entities.Category;
import com.courses.courses.entities.Course;
import com.courses.courses.entities.Pdf;
import com.courses.courses.exceptions.CategoryNotFoundException;
import com.courses.courses.exceptions.CoursExistsException;
import com.courses.courses.mappers.CoursMapper;
import com.courses.courses.repositoris.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private final CoursRepository coursRepository;
    private final CoursMapper coursMapper;
    private final CategoryService categoryService;
    private final PdfService pdfService;

    @Override
    public CourseDTO createCours(CourseDTO courseDTO) {

        if (!coursRepository.existsByNameAndCategoryName(courseDTO.getName(), courseDTO.getCategory().getName())) {

            Category category = categoryService.findByName(courseDTO.getCategory().getName()).orElseThrow(() -> new CategoryNotFoundException());

            List<Pdf> pdfs = pdfService.pdfListToPdfDtoList(courseDTO.getPdfs());

            Course course = coursMapper.convertCoursDTOToCours(courseDTO, category, pdfs);


            return this.assembleDTOFromEntities(coursRepository.save(course));
        }
        throw new CoursExistsException();
    }

    @Override
    public List<CourseDTO> findAll() {

        List<Course> courseList = coursRepository.findAll();
        List<CourseDTO> courseDTOList = new ArrayList<>();

        if (!courseList.isEmpty()) {
            courseList.stream()
                    .map(course -> this.assembleDTOFromEntities(course))
                    .collect(Collectors.toList());
        }
        return courseDTOList;
    }

    private CourseDTO assembleDTOFromEntities(Course course) {


        CategoryDTO category = new CategoryDTO();
        if (categoryService.existsByName(course.getCategory().getName())) {
            category.setName(course.getCategory().getName());
        } else {
            throw new CategoryNotFoundException();
        }
        List<PdfDTO> pdfs = pdfService.pdfDTOListToPdfList(course.getPdfs());

        return coursMapper.convertCoursToCoursDTO(course, category, pdfs);

    }

}
