package org.loktevik.springproject.dao;

import org.loktevik.springproject.models.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    User get(long id);

    List<User> getAll();

    void save(User user);

    void update(User user);

    void delete(long id);
}