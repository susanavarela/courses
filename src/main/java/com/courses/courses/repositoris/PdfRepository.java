package com.courses.courses.repositoris;

import com.courses.courses.entities.Pdf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PdfRepository extends JpaRepository<Pdf, Long> {
}
