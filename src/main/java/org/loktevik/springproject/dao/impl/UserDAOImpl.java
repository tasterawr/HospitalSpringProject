package org.loktevik.springproject.dao.impl;

import org.loktevik.springproject.dao.UserDAO;
import org.loktevik.springproject.models.User;

import java.util.ArrayList;
import java.util.List;

//@Component
public class UserDAOImpl implements UserDAO {

    @Override
    public User get(long id) {
        return new User();
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(long id) {

    }
}
