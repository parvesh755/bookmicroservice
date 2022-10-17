package com.sca.bookmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sca.bookmicroservice.entity.Book;
import com.sca.bookmicroservice.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookService bookService;
    
    @Autowired
	   RestTemplate restTemplate;
    
    
    @RequestMapping(value = "/savebook", method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bookService.saveBook(book);
        return bookResponse;
    }
    
    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetails(@PathVariable int bookId) {
          
    	  Book bookResponse = bookService.findByBookId(bookId);
    	  
        return bookResponse;
    }
    
    
    @RequestMapping(value = "bookdetails/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetailsbybookid(@PathVariable int bookId) {
          
    	  Book bookResponse = bookService.findByBookId(bookId);
    	  
    	    String url = "http://localhost:9002/story/stories"; 
    	    
  	      List contects = restTemplate.getForObject(url,List.class,HttpMethod.GET);
  	  
  	//   studentdata.setContects(contects);
  	    bookResponse.setStoryList(contects);
  	// return studentdata;
  	  
  	  
    	  
        return bookResponse;
    }
    
    
    
    
    
    
    
    
}