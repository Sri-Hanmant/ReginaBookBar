package com.book.demo.dto;

import com.book.demo.entity.UserEntity;

import javax.validation.constraints.NotEmpty;

public class UserDTO {
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    @NotEmpty(message = "Confirm Password cannot be empty")
    private String confirmPassword;

    public UserDTO() {

    }

    public UserDTO(String username, String password, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    //Convert UserDTO to UserEntity
    public UserEntity toUserEntity() {
        UserEntity user = new UserEntity();
        user.setUsername(this.username);
        user.setPassword(this.password);
        user.setConfirmPassword(this.confirmPassword);
        return user;
    }

}
