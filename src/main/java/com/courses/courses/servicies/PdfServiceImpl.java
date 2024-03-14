package com.courses.courses.servicies;

import com.courses.courses.dtos.PdfDTO;
import com.courses.courses.entities.Pdf;
import com.courses.courses.exceptions.PdfMapperException;
import com.courses.courses.mappers.PdfMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PdfServiceImpl implements PdfService {

    private final PdfMapper pdfMapper;

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
}
