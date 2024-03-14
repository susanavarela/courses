package com.courses.courses.servicies;

import com.courses.courses.entities.Category;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> findByName(String name);

    Boolean existsByName(String name);
}
