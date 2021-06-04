package com.book.demo.controller;

import com.book.demo.dto.BookDetailsDTO;
import com.book.demo.dto.UpdateBookDetailsDTO;
import com.book.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<BookDetailsDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public void createBook(@Validated @RequestBody BookDetailsDTO bookDetails) {
        bookService.createBook(bookDetails);
    }

    @PutMapping(path = "/book/{id}")
    public void updateBook(@Validated @RequestBody UpdateBookDetailsDTO updateBookDetailsDTO, @PathVariable long id) {
        bookService.updateBook(updateBookDetailsDTO, id);
    }

    @DeleteMapping(path = "/book/{id}")
    public void deleteBookById(@PathVariable long id) {
        bookService.deleteBookById(id);
    }
}



