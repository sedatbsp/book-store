package com.sedatbsp.bookstore.security.jwt;

import com.sedatbsp.bookstore.security.UserPrincipal;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Sedat Başpınar
 * @created 25.09.2021 - 12:53 AM
 * @project book-store
 */
public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);

    Claims extractClaims(HttpServletRequest request);
}
