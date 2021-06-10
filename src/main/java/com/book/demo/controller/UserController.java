package com.book.demo.controller;

import com.book.demo.dto.LoginUserDTO;
import com.book.demo.dto.UserDTO;
import com.book.demo.interfaces.UserInterface;
import com.book.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserInterface userInterface;

    @PostMapping("/register")
    public void registerUser(@Validated @RequestBody UserDTO newUserDTO) {
        userInterface.registerUser(newUserDTO);
    }

    @GetMapping("/login")
    public void loginUser(@Validated @RequestBody LoginUserDTO loginUserDTO) {
        userInterface.loginUser(loginUserDTO.getUsername(), loginUserDTO);
    }


}
