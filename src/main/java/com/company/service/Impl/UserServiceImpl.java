package com.company.service.Impl;

import com.company.dao.UserRepository;
import com.company.entity.User;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserServiceInter {
    @Autowired
    private UserRepository userRepo;


    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
