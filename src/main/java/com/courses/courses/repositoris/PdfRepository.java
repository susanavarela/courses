package com.courses.courses.repositoris;

import com.courses.courses.entities.Course;
import com.courses.courses.entities.Pdf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PdfRepository extends JpaRepository<Pdf, Long> {
    List<Pdf> findAllByCourse(Course course);
}
