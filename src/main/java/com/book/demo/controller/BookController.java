package com.book.demo.controller;

import com.book.demo.dto.BookDetailsDTO;
import com.book.demo.entity.BookDetailsEntity;
import com.book.demo.repository.BookRepository;
import com.book.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public void createBook(@Validated @RequestBody BookDetailsDTO bookDetails){
        bookService.createBook(bookDetails);
    }

    @GetMapping
    public List<BookDetailsDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @DeleteMapping(path="/book/{id}")
    public void deleteBookById(@PathVariable long id) {
        bookService.deleteBookById(id);
    }
}



