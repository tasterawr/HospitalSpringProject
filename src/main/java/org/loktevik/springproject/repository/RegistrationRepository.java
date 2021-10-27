package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    Registration getById(long id);

    List<Registration> findAll();

    Registration save(Registration registration);

    void update(Registration registration);

    void delete(long id);
}
