package com.sedatbsp.bookstore.service;

import com.sedatbsp.bookstore.model.Role;
import com.sedatbsp.bookstore.model.User;
import com.sedatbsp.bookstore.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:23 PM
 * @project book-store
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional // güncelleme/silme sorgusu yürütülürken Transactional zorunlu
    public void makeAdmin(String username){
        userRepository.updateUserRole(username,Role.ADMIN);
    }

}
