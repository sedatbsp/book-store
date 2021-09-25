package com.sedatbsp.bookstore.service;

import com.sedatbsp.bookstore.model.User;

/**
 * @author Sedat Başpınar
 * @created 25.09.2021 - 2:20 PM
 * @project book-store
 */
public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
