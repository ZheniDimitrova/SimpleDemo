package com.example.demoapplication.service.impl;

import com.example.demoapplication.model.entity.User;
import com.example.demoapplication.repository.UserRepository;
import com.example.demoapplication.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(String name,String email, String pass) {
        User user = new User(name, email, pass);

        userRepository.save(user);

    }

    @Override
    public void logInUser() {

    }

    @Override
    public void logOutUser() {

    }
}
