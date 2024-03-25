package com.courses.courses.mappers;

import com.courses.courses.dtos.PdfDTO;
import com.courses.courses.entities.Pdf;
import org.springframework.stereotype.Component;
@Component
public class PdfMapper {

    public Pdf pdfDTOToPdf(PdfDTO pdfDTO) {
        return Pdf.builder()
                .name(pdfDTO.getName())
                .build();

    }

    public PdfDTO pdfDTOToPdf(Pdf pdf) {
        return PdfDTO.builder()
                .name(pdf.getName())
                .build();

    }
}
