package com.book.demo.service;

import com.book.demo.dto.LoginUserDTO;
import com.book.demo.dto.UserDTO;
import com.book.demo.entity.UserEntity;
import com.book.demo.interfaces.UserInterface;
import com.book.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class UserService implements UserInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(UserDTO newUserDTO) {
        UserEntity userEntity = newUserDTO.toUserEntity();
        userRepository.save(userEntity);
    }

    @Override
    public void loginUser(String uname, LoginUserDTO loginUserDTO) {
        UserEntity usersEntity = userRepository.findByUsername(uname);
        if (loginUserDTO.getUsername().equals(usersEntity.getUsername()) &&
                loginUserDTO.getPassword().equals(usersEntity.getPassword())) {
            System.out.println("Login Successful");
        }
    }
}
