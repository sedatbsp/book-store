package com.sedatbsp.bookstore.security;

import com.sedatbsp.bookstore.model.Role;
import com.sedatbsp.bookstore.model.User;
import com.sedatbsp.bookstore.util.SecurityUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

/**
 * @author Sedat Başpınar
 * @created 22.09.2021 - 1:02 AM
 * @project book-store
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Builder design pattern.
public class UserPrincipal implements UserDetails {

    private Long id;
    private String username;
    transient private String password; //
    transient private User user; // login işlemi için. Jwt kullanmadan.
    private Set<GrantedAuthority> authorities;

    public static UserPrincipal createSuperUser(){
        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(Role.SYSTEM_ADMIN.name()));

        return UserPrincipal.builder()
                .id(-1L)
                .username("system_admin")
                .authorities(authorities)
                .build();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
