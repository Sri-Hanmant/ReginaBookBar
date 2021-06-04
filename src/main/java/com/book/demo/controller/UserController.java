package com.book.demo.controller;

import com.book.demo.dto.UserDTO;
import com.book.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public void registerUser(@Validated @RequestBody UserDTO newUserDTO) {
        userService.registerUser(newUserDTO);
    }


}
