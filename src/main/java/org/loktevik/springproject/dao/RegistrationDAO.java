package org.loktevik.springproject.dao;

import org.loktevik.springproject.models.Registration;

import java.util.List;
import java.util.Optional;

public interface RegistrationDAO {
    Registration get(long id);

    List<Registration> getAll();

    void save(Registration registration);

    void update(Registration registration);

    void delete(long id);
}
