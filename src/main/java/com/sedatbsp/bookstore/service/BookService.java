package com.sedatbsp.bookstore.service;

import com.sedatbsp.bookstore.model.Book;
import com.sedatbsp.bookstore.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:40 PM
 * @project book-store
 */
@Service
public class BookService implements IBookService{

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book saveBook(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

}
