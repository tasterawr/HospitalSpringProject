package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.dao.DoctorDAO;
import org.loktevik.springproject.models.Doctor;
import org.loktevik.springproject.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("doctorService")
public class DoctorServiceImpl implements DoctorService{
    private DoctorDAO doctorDao;

    @Autowired
    public DoctorServiceImpl(DoctorDAO doctorDao){
        this.doctorDao = doctorDao;
    }

    public Doctor getDoctor(long id){
        return doctorDao.get(id);
    }

    public List<Doctor> getAllDoctors(){
        return doctorDao.getAll();
    }

    public void saveDoctor(Doctor doctor){
        doctorDao.save(doctor);
    }

    public void updateDoctor(Doctor doctor){

    }

    public void deleteDoctor(long id){

    }
}
