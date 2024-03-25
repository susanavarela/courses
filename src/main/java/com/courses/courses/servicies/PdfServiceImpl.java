package com.courses.courses.servicies;

import com.courses.courses.dtos.PdfDTO;
import com.courses.courses.entities.Course;
import com.courses.courses.entities.Pdf;
import com.courses.courses.exceptions.PdfMapperException;
import com.courses.courses.mappers.PdfMapper;
import com.courses.courses.repositoris.PdfRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PdfServiceImpl implements PdfService {

    private final PdfMapper pdfMapper;
    private final PdfRepository pdfRepository;


    @Override
    public List<Pdf> pdfListToPdfDtoList(List<PdfDTO> pdfsDTO) {

        if (!pdfsDTO.isEmpty()) {
            return pdfsDTO.stream()
                    .map(pdf -> pdfMapper.pdfDTOToPdf(pdf))
                    .collect(Collectors.toList());
        }

        throw new PdfMapperException();
    }

    @Override
    public List<PdfDTO> pdfDTOListToPdfList(List<Pdf> pdfs) {
        if (!pdfs.isEmpty()) {
            return pdfs.stream()
                    .map(pdf -> pdfMapper.pdfDTOToPdf(pdf))
                    .collect(Collectors.toList());
        }

        throw new PdfMapperException();
    }

    @Override
    public Pdf save(String name, Course course) {
        Pdf pdf = Pdf.builder()
                .name(name)
                .course(course)
                .build();
        return pdfRepository.save(pdf);
    }

    @Override
    public List<Pdf> getPdfToCourse(Course course) {
        return pdfRepository.findAllByCourse(course);
    }
}
