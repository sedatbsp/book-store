package com.sedatbsp.bookstore.controller;

import com.sedatbsp.bookstore.model.Book;
import com.sedatbsp.bookstore.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sedat Başpınar
 * @created 28.09.2021 - 4:33 PM
 * @project book-store
 */
@RestController
@RequestMapping("api/book") // path
public class BookController {

    @Autowired
    private IBookService bookService;

    @PostMapping // api/book
    public ResponseEntity<?> saveBook(@RequestBody Book book){
        bookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId){
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping // api/book
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(bookService.findAllBooks(),HttpStatus.OK);
    }




}
