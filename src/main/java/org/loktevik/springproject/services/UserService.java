package org.loktevik.springproject.services;

import org.loktevik.springproject.models.User;

import java.util.List;

public interface UserService {
    User getUser(long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}
