package com.book.demo.service;

import com.book.demo.dto.UserDTO;
import com.book.demo.entity.UserEntity;
import com.book.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void registerUser(UserDTO newUserDTO) {
        UserEntity userEntity = newUserDTO.toUserEntity();
        userRepository.save(userEntity);

    }


}
