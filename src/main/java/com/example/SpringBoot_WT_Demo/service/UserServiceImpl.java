package com.example.SpringBoot_WT_Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.SpringBoot_WT_Demo.entity.User;
import com.example.SpringBoot_WT_Demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}