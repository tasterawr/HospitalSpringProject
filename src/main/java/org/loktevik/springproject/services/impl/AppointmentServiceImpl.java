package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.dao.AppointmentDAO;
import org.loktevik.springproject.models.Appointment;
import org.loktevik.springproject.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService{
    private AppointmentDAO appointmentDao;

    @Autowired
    public AppointmentServiceImpl(AppointmentDAO appointmentDao){
        this.appointmentDao = appointmentDao;
    }

    public Appointment getAppointment(long id){
        return appointmentDao.get(id);
    }

    public List<Appointment> getAllAppointments(){
        return appointmentDao.getAll();
    }

    public void saveAppointment(Appointment appointment){
        appointmentDao.save(appointment);
    }

    public void updateAppointment(Appointment appointment){

    }

    public void deleteAppointment(long id){

    }
}
