package org.loktevik.springproject.services;

import org.loktevik.springproject.dao.IUserDAO;
import org.loktevik.springproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class UserService {
    private IUserDAO<User> userDao;

    @Autowired
    public UserService(IUserDAO<User> userDao){
        this.userDao = userDao;
    }

    public User getUser(long id){
        return userDao.get(id).orElse(new User());
    }

    public List<User> getAllUsers(){
        return userDao.getAll();
    }

    public void saveUser(User user){
        userDao.save(user);
    }

    public void updateUser(User user){

    }

    public void deleteUser(long id){

    }
}
