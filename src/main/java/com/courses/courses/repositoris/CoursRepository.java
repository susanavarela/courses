package com.courses.courses.repositoris;

import com.courses.courses.entities.Category;
import com.courses.courses.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoursRepository extends JpaRepository<Course, Long> {

    boolean existsByNameAndCategoryName(String courseName, String categoryName);
}
