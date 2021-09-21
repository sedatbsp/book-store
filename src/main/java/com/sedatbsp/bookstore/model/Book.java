package com.sedatbsp.bookstore.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:58 AM
 * @project book-store
 */
@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description",nullable = false,length = 2000)
    private String description;

    @Column(name = "author",nullable = false)
    private String author;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;

}
