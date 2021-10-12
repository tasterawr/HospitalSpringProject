package org.loktevik.springproject.services;

import org.loktevik.springproject.models.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor getDoctor(long id);

    List<Doctor> getAllDoctors();

    void saveDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(long id);
}
