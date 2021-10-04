package org.loktevik.springproject.dao;

import org.loktevik.springproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TestUserDAO implements IUserDAO<User> {

    @Autowired
    List<User> testUsers;

    @Override
    public Optional<User> get(long id) {
        Optional<User> user = testUsers.stream()
                .filter(x -> x.getId() == id)
                .findFirst();

        return user;
    }

    @Override
    public List<User> getAll() {
        return testUsers;
    }

    @Override
    public void save(User user) {
        testUsers.add(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(long id) {
        Optional<User> user = get(id);
        if (user.isPresent()){
            testUsers.remove(user);
        }
    }
}
