package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.repository.UserCardRepository;
import org.loktevik.springproject.models.UserCard;
import org.loktevik.springproject.services.UserCardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserCardServiceImpl implements UserCardService{
    private UserCardRepository userCardRepository;

    @Autowired
    public UserCardServiceImpl(UserCardRepository userCardRepository){
        this.userCardRepository = userCardRepository;
    }

    public UserCard getUserCard(long id){
        return new UserCard();
    }

    public List<UserCard> getAllUserCards(){
        return new ArrayList<>();
    }

    public void saveUserCard(UserCard userCard){
        userCardRepository.save(userCard);
    }

    public void updateUserCard(UserCard userCard){

    }

    public void deleteUserCard(long id){

    }
}
