package org.loktevik.springproject;

import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HospitalSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        UserService service = (UserService) context.getBean("userService");
//        User user = new User();
//        user.setName("Иванов Иван Иванович");
//        user.setNumber("88005553535");
//        user.setEmail("ivanov350@gmail.com");
//        user.setLogin("ivanov_ii");
//        user.setPassword("1234");
//        service.saveUser(user);
//
//        List<User> users = service.getAllUsers();
//        System.out.println(users.get(0));
    }
}
