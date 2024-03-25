package com.courses.courses.dtos;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDTO {

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
