package org.loktevik.springproject.dao;

import org.loktevik.springproject.models.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentDAO {
    Appointment get(long id);

    List<Appointment> getAll();

    void save(Appointment appointment);

    void update(Appointment appointment);

    void delete(long id);
}
