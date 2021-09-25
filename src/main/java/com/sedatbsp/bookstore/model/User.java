package com.sedatbsp.bookstore.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:35 AM
 * @project book-store
 */
@Data
@Entity
@Table(name = "users") // Default olarak user kullanamayız, çünkü postgresql'de user ayrılmış bir ad'dır.
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",unique = true,nullable = false)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name="create_time",nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private Role role;

    @Transient
    private String token;

}
