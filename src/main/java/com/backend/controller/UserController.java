package com.backend.controller;

import com.backend.entity.User;
import com.backend.repository.UserRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUSers(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public ResponseEntity<User> findById(@PathVariable(value = "userId") Long userId){
        Optional<User> user = userRepository.findById(userId);

        if(user.isPresent()) return new ResponseEntity<User>(user.get(), HttpStatus.OK);

        return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    }

}
