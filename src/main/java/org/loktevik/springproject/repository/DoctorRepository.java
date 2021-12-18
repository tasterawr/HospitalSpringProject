package org.loktevik.springproject.repository;

import org.loktevik.springproject.models.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    Optional<Doctor> findDoctorByLoginLogin(String login);

    Doctor getById(long id);

    List<Doctor> findAll();

    Doctor save(Doctor doctor);

    void deleteById(long id);

    void deleteDoctorByLoginLogin(String login);
}
