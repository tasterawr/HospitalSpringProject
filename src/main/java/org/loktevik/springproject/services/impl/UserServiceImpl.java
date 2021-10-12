package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.dao.UserDAO;
import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;

import java.util.List;

//@Service("userService")
public class UserServiceImpl implements UserService{
    private UserDAO userDao;

    public UserServiceImpl(UserDAO userDao){
        this.userDao = userDao;
    }

    public User getUser(long id){
        return userDao.get(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAll();
    }

    public void saveUser(User user){
        userDao.save(user);
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

        userDao.update(user);
    }

    public void deleteUser(long id){
        userDao.delete(id);
    }
}
