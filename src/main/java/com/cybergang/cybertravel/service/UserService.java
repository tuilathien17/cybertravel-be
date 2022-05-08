package com.cybergang.cybertravel.service;

import com.cybergang.cybertravel.model.User;
import com.cybergang.cybertravel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public void addUser(User user) {
        repository.insert(user);
    }

    public User findUserById(String id) {
        return repository.findById(id);
    }

    public void updateUser(User user) {
        repository.save(user);
    }

    public void removeUserById(String id) {
        repository.deleteById(id);
    }
}
