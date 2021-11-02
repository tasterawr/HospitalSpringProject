package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.repository.AppointmentRepository;
import org.loktevik.springproject.models.Appointment;
import org.loktevik.springproject.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentServiceImpl implements AppointmentService{
    private AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment getAppointment(long id){
        return appointmentRepository.getById(id);
    }

    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }

    public void saveAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public void updateAppointment(Appointment appointment){

    }

    public void deleteAppointment(long id){

    }
}
