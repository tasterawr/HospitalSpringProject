package org.loktevik.springproject.dao.impl;

import org.loktevik.springproject.dao.UserDAO;
import org.loktevik.springproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

//@Component
public class TestUserDAOImpl implements UserDAO {

    private List<User> testUsers;

    public TestUserDAOImpl(){}

    @Override
    public User get(long id) {
        Optional<User> user = testUsers.stream()
                .filter(x -> x.getId() == id)
                .findFirst();

        return user.orElse(new User());
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
        User user = get(id);
        if (user.getName() != null) {
            testUsers.remove(user);
        }
    }

    public void setTestUsers(List<User> testUsers) {
        this.testUsers = testUsers;
    }
}
