package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.repository.DoctorRepository;
import org.loktevik.springproject.models.Doctor;
import org.loktevik.springproject.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorServiceImpl implements DoctorService{
    private DoctorRepository doctorRepository;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }

    public Doctor getDoctor(long id){
        return doctorRepository.getById(id);
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }

    public void updateDoctor(Doctor doctor){

    }

    public void deleteDoctor(long id){

    }
}
