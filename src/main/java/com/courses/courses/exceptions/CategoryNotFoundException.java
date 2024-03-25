package com.courses.courses.exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException() {
        super("Category not found");
    }
}
