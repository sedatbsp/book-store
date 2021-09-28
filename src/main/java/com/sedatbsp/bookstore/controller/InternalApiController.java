package com.sedatbsp.bookstore.controller;

import com.sedatbsp.bookstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sedat Başpınar
 * @created 28.09.2021 - 4:12 PM
 * @project book-store
 */
@RestController
@RequestMapping("api/internal") // path
public class InternalApiController {

    @Autowired
    private IUserService userService;

    @PutMapping("make-admin/{username}") // api/internal/make-admin/{username}
    public ResponseEntity<?> makeAdmin(@PathVariable String username){
        userService.makeAdmin(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
