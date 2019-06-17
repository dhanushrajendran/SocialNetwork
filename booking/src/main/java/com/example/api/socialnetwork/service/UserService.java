package com.example.api.socialnetwork.service;

import com.example.api.socialnetwork.model.User;
import com.example.api.socialnetwork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }


    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);

    }

    public void  deleteUserByuserId(Long userId) {
        userRepository.deleteUserByuserId(userId);
    }
}


