package com.sedatbsp.bookstore.service;

import com.sedatbsp.bookstore.model.Book;

import java.util.List;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:40 PM
 * @project book-store
 */
public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
