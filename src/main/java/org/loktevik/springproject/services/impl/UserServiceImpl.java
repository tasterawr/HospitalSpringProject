package org.loktevik.springproject.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.loktevik.springproject.repository.UserRepository;
import org.loktevik.springproject.models.User;
import org.loktevik.springproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @SneakyThrows
    public User getUserByLogin(String login){
        return userRepository.findUserByLoginLogin(login).orElseThrow(Exception::new);
    }

    @Override
    public User getUser(long id) {
        return userRepository.getById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @SneakyThrows
    public void updateUser(String login, String type, String newValue){
        User user = userRepository.findUserByLoginLogin(login).orElseThrow(Exception::new);

        if (type.equals("name")){
            user.setName(newValue);
        }
        else if (type.equals("number")){
            user.setNumber(newValue);
        }
        else if (type.equals("email")){
            user.setEmail(newValue);
        }
        else if (type.equals("password")){
            user.setPassword(passwordEncoder.encode(newValue));
        }

        userRepository.save(user);
    }

    @SneakyThrows
    public void deleteUserByLogin(String login){
        User user = userRepository.findUserByLoginLogin(login).orElseThrow(Exception::new);
        userRepository.deleteById(user.getId());
    }
}
