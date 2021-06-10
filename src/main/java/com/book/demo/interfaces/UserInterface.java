package com.book.demo.interfaces;

import com.book.demo.dto.LoginUserDTO;
import com.book.demo.dto.UserDTO;

public interface UserInterface {

    void registerUser(UserDTO newUserDTO);
    void loginUser(String uname, LoginUserDTO loginUserDTO);

}
