package com.sca.bookmicroservice.service;

import org.springframework.stereotype.Component;

import com.sca.bookmicroservice.entity.Book;


@Component
public interface BookService 
{
      public Book saveBook(Book book);
      public Book findByBookId(int bookId);
}