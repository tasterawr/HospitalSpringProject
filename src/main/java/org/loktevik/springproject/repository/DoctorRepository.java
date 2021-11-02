package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    Doctor getById(long id);

    List<Doctor> findAll();

    Doctor save(Doctor doctor);

    void deleteById(long id);
}
