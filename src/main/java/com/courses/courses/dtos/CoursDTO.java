package com.courses.courses.dtos;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class CoursDTO {

    @NotBlank
    private String name;

    @NotBlank
    @OneToMany
    private CategoryDTO category;

    @NotBlank
    private String description;

    @NotBlank
    private String link;

    @ManyToMany
    private List<PdfDTO> pdfs;

}
