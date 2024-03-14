package com.courses.courses.exceptions;

public class CoursExistsException extends RuntimeException {
    public CoursExistsException() {
        super( "The course already exists");
    }
}
