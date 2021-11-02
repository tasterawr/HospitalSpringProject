package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User getById(long id);

    List<User> findAll();

    User save(User user);

    void deleteById(long id);
}