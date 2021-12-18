package org.loktevik.springproject.controllers;

import lombok.RequiredArgsConstructor;
import org.loktevik.springproject.models.Login;
import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("user")
@Transactional
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("home")
    public ModelAndView homePage(){
        User user = userService.getUserByLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        ModelAndView modelAndView = new ModelAndView("user_home");
        modelAndView.addObject("name", user.getName());
        modelAndView.addObject("login", user.getLogin());
        modelAndView.addObject("phone", user.getNumber());
        modelAndView.addObject("email", user.getEmail());
        return modelAndView;
    }

    @GetMapping(value = "/add-user")
    public ModelAndView addUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return new ModelAndView("add_user");
    }

    @GetMapping(value = "update-user")
    public ModelAndView updateUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        return new ModelAndView("update_user");
    }

    @GetMapping(value = "delete-user")
    public ModelAndView deleteUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        return new ModelAndView("delete_user");
    }

    @PostMapping(value = "/add-user")
    public ModelAndView addUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        addNewUser(name, number, email, login, password);

        return new ModelAndView("add_user");
    }

    @GetMapping(value = "/get-users")
    public ModelAndView getUsersRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<User> users = userService.getAllUsers();

        ModelAndView modelAndView = new ModelAndView("get_all_users");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @PostMapping(value = "/update-user")
    public ModelAndView updateUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String type = request.getParameter("parameter");
        String newValue = request.getParameter("newValue");
        updateUser(type, newValue);

        return new ModelAndView("update_user");
    }

    @PostMapping(value = "/delete-user")
    public String deleteUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.deleteUserByLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        return "redirect:/logout";
    }

    private void addNewUser(String name, String number, String email, String login, String password){
        User user = new User();
        user.setName(name);
        user.setNumber(number);
        user.setEmail(email);
        user.setLogin(new Login(0, login, null, null));
        user.setPassword(password);

        userService.saveUser(user);
    }

    private void updateUser(String parameter, String newValue){
        userService.updateUser(SecurityContextHolder.getContext().getAuthentication().getName(), parameter, newValue);
    }
}
