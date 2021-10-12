package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.dao.UserCardDAO;
import org.loktevik.springproject.models.UserCard;
import org.loktevik.springproject.services.UserCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service("userCardService")
public class UserCardServiceImpl implements UserCardService{
    private UserCardDAO userCardDAO;

    @Autowired
    public UserCardServiceImpl(UserCardDAO userCardDAO){
        this.userCardDAO = userCardDAO;
    }

    public UserCard getUserCard(long id){
        return new UserCard();
    }

    public List<UserCard> getAllUserCards(){
        return new ArrayList<>();
    }

    public void saveUserCard(UserCard userCard){
        userCardDAO.save(userCard);
    }

    public void updateUserCard(UserCard userCard){

    }

    public void deleteUserCard(long id){

    }
}
