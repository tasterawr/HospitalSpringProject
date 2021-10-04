package org.loktevik.springproject;

import org.loktevik.springproject.dao.IUserDAO;
import org.loktevik.springproject.dao.TestUserDAO;
import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public IUserDAO userDAO(){
        return new TestUserDAO();
    }

    @Bean
    public UserService userService(){
        return new UserService(userDAO());
    }
    @Bean
    public List<User> users(){
        return new ArrayList<User>();
    }
}
