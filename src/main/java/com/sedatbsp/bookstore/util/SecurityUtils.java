package com.sedatbsp.bookstore.util;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author Sedat Başpınar
 * @created 22.09.2021 - 12:56 AM
 * @project book-store
 */
public class SecurityUtils {
    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority convertToAuthority(String role){
        String formattedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX+role;
        return new SimpleGrantedAuthority(formattedRole);
    }

}
