package com.book.demo.errors;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Errors> handleException(MethodArgumentNotValidException e) {
        Errors err = new Errors(HttpStatus.NOT_FOUND, e.getLocalizedMessage());
        return new ResponseEntity<>(err, err.getHttpStatus());
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<Errors> noEntityExists(EmptyResultDataAccessException e){
        String mes = "No Entity found in DB";
        Errors err = new Errors(HttpStatus.NOT_FOUND, mes);
        return new ResponseEntity<>(err, err.getHttpStatus());
    }
}

