package com.courses.courses.servicies;

import com.courses.courses.entities.Category;
import com.courses.courses.repositoris.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;
    @Override
    public Optional<Category> findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Boolean existsByName(String name) {
        return categoryRepository.existsByName(name);
    }
}
