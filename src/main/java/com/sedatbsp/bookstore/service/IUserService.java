package com.sedatbsp.bookstore.service;

import com.sedatbsp.bookstore.model.User;

import java.util.Optional;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:23 PM
 * @project book-store
 */
public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
