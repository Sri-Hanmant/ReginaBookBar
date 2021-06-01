package com.book.demo.errors;

import org.springframework.http.HttpStatus;

public class Errors {
    private final HttpStatus httpStatus;
    private final String message;

    public Errors(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}
