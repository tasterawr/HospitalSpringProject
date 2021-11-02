package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.UserCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCardRepository extends CrudRepository<UserCard, Long> {
    UserCard getById(long id);

    List<UserCard> findAll();

    UserCard save(UserCard userCard);

    void deleteById(long id);
}
