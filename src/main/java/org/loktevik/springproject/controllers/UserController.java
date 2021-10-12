package org.loktevik.springproject.controllers;

import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){ this.userService = userService;}

    @GetMapping("/add-user")
    public String addUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "add_user";
    }

    @GetMapping("update-user")
    public String updateUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        return "update_user";
    }

    @GetMapping("delete-user")
    public String deleteUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        return "delete_user";
    }

    @PostMapping("/add-user")
    public void addUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        addNewUser(id, name, number, email, login, password);

        addUserPage(request, response);
    }

    @GetMapping("/get-users")
    public void getUsersRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<User> users = userService.getAllUsers();
        PrintWriter out = response.getWriter();
        for (User u : users){
            out.write(u.toString() + "<br>");
        }
    }

    @PostMapping("/update-user")
    public void updateUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String type = request.getParameter("parameter");
        String newValue = request.getParameter("newValue");
        updateUser(id, type, newValue);

        updateUserPage(request, response);
    }

    @PostMapping("/delete-user")
    public void deleteUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        deleteUser(id);
    }

    private void addNewUser(String id, String name, String number, String email, String login, String password){
        User user = new User();
        user.setId(Long.parseLong(id));
        user.setName(name);
        user.setNumber(number);
        user.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);

        userService.saveUser(user);
    }

    private void updateUser(String id, String parameter, String newValue){
        User user = userService.getUser(Long.parseLong(id));
        userService.updateUser(user, parameter, newValue);
    }

    private void deleteUser(String id){
        userService.deleteUser(Long.parseLong(id));
    }
}
