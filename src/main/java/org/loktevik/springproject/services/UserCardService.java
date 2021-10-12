package org.loktevik.springproject.services;

import org.loktevik.springproject.models.UserCard;

import java.util.List;

public interface UserCardService {
    UserCard getUserCard(long id);

    List<UserCard> getAllUserCards();

    void saveUserCard(UserCard userCard);

    void updateUserCard(UserCard userCard);

    void deleteUserCard(long id);
}
