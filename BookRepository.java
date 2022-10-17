package com.sca.bookmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.bookmicroservice.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    public Book  findByBookId(int bookId);
}