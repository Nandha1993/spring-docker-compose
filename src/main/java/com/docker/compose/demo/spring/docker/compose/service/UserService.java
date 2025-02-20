package com.docker.compose.demo.spring.docker.compose.service;

import com.docker.compose.demo.spring.docker.compose.dao.UserRepository;
import com.docker.compose.demo.spring.docker.compose.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No user by ID: " + id));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
