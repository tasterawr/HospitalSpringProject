package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByLoginLogin(String login);

    User getById(long id);

    List<User> findAll();

    User save(User user);

    void deleteById(long id);

    void deleteUserByLogin(String login);
}