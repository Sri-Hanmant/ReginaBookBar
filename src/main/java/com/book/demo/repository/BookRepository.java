package com.book.demo.repository;

import com.book.demo.entity.BookDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookDetailsEntity, Long> {

    List<BookDetailsEntity> findAll();

    @Override
    void deleteById(Long id);
}
