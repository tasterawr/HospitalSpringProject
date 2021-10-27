package org.loktevik.springproject.services;

import org.loktevik.springproject.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("appointmentService")
public interface AppointmentService {
    Appointment getAppointment(long id);

    List<Appointment> getAllAppointments();

    void saveAppointment(Appointment appointment);

    void updateAppointment(Appointment appointment);

    void deleteAppointment(long id);

}
