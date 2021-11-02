package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    Appointment getById(long id);

    List<Appointment> findAll();

    Appointment save(Appointment appointment);

    void deleteById(long id);
}
