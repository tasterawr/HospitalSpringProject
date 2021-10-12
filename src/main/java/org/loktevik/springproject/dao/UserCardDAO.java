package org.loktevik.springproject.dao;

import org.loktevik.springproject.models.UserCard;

import java.util.List;
import java.util.Optional;

public interface UserCardDAO {
    UserCard get(long id);

    List<UserCard> getAll();

    void save(UserCard userCard);

    void update(UserCard userCard);

    void delete(long id);
}
