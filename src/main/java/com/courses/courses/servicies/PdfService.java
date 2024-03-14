package com.courses.courses.servicies;

import com.courses.courses.dtos.PdfDTO;
import com.courses.courses.entities.Pdf;

import java.util.List;

public interface PdfService {

    public List<Pdf> pdfListToPdfDtoList(List<PdfDTO> pdfsDTO);

    public List<PdfDTO> pdfDTOListToPdfList(List<Pdf> pdfs);
}
