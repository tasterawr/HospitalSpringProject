package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.repository.UserRepository;
import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUser(long id){
        return userRepository.getById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void updateUser(User user, String type, String newValue){
        if (type.equals("name")){
            user.setName(newValue);
        }
        else if (type.equals("number")){
            user.setNumber(newValue);
        }
        else if (type.equals("email")){
            user.setEmail(newValue);
        }
        else if (type.equals("login")){
            user.setLogin(newValue);
        }
        else if (type.equals("password")){
            user.setPassword(newValue);
        }

        userRepository.save(user);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
}
