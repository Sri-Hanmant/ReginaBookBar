package com.book.demo.service;

import com.book.demo.dto.BookDetailsDTO;
import com.book.demo.dto.UpdateBookDetailsDTO;
import com.book.demo.entity.BookDetailsEntity;
import com.book.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import sun.invoke.empty.Empty;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    //Entity to DTO
    public List<BookDetailsDTO> getAllBooks() {
        List<BookDetailsEntity> entityList = bookRepository.findAll();
        // List<BookDetailsDTO> books = new ArrayList<>();
        // entityList.stream().forEach(s->{
        //   books.add(BookDetailsDTO.singleEntityConversion(s));
        //});
        //return entityList.stream().map(e ->BookDetailsDTO.singleEntityConversion(e)).collect(Collectors.toList());

        return entityList.stream().map(BookDetailsDTO::singleEntityConversion).collect(Collectors.toList());

    }

    //DTO to Entity
    public void createBook(BookDetailsDTO bookDetailsDTO) {
        BookDetailsEntity bookEntity = bookDetailsDTO.toEntity();
        bookRepository.save(bookEntity);
    }

    //Update the specific detail in a book
    //SO update the column in table with what we read from jason (DTO -> Entity)
    public void updateBook(UpdateBookDetailsDTO updateBookDetailsDTO, long id) {
        Optional<BookDetailsEntity> updateBookEntity = bookRepository.findById(id);
        if (updateBookEntity.isPresent()) {
            BookDetailsEntity saveUpdateToEntity = updateBookDetailsDTO.updateSpecificEntityDetails(updateBookEntity.get());
            bookRepository.save(saveUpdateToEntity);
        }
    }

    public void deleteBookById(long id) {
        bookRepository.deleteById(id);
    }

}
