package org.loktevik.springproject;

import org.loktevik.springproject.dao.UserDAO;
import org.loktevik.springproject.dao.impl.TestUserDAOImpl;
import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.loktevik.springproject.services.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserDAO userDAO(){
        return new TestUserDAOImpl();
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl(userDAO());
    }
    @Bean
    public List<User> users(){
        return new ArrayList<User>();
    }
}
