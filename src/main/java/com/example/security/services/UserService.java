package com.example.security.services;

import com.example.security.models.User;
import com.example.security.repos.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {

        return new ArrayList<>(userRepository.findAll());
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByEmail(username);
    }
}