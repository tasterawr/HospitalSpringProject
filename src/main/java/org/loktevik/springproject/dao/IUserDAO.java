package org.loktevik.springproject.dao;

import java.util.List;
import java.util.Optional;

public interface IUserDAO<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(long id);
}