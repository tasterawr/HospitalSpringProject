package org.loktevik.springproject.services;

import org.loktevik.springproject.models.Login;
import org.loktevik.springproject.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public interface UserService {
    User getUserByLogin(String login);

    User getUser(long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(String login, String type, String newValue);

    void deleteUserByLogin(String login);
}
