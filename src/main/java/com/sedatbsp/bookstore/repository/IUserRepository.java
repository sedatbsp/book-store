package com.sedatbsp.bookstore.repository;

import com.sedatbsp.bookstore.model.Role;
import com.sedatbsp.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 1:46 PM
 * @project book-store
 */
public interface IUserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role")Role role);

}
