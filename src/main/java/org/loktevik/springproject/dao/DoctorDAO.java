package org.loktevik.springproject.dao;

import org.loktevik.springproject.models.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorDAO {
    Doctor get(long id);

    List<Doctor> getAll();

    void save(Doctor doctor);

    void update(Doctor doctor);

    void delete(long id);
}
