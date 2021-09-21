package com.sedatbsp.bookstore.repository;

import com.sedatbsp.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 1:59 PM
 * @project book-store
 */
public interface IBookRepository extends JpaRepository<Book,Long> {



}
