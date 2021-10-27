package org.loktevik.springproject.services;

import org.loktevik.springproject.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public interface UserService {
    User getUser(long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user, String type, String newValue);

    void deleteUser(long id);
}
