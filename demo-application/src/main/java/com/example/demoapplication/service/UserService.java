package com.example.demoapplication.service;

public interface UserService {

    void registerUser(String name, String email, String pass);

    void logInUser();

    void logOutUser();
}
