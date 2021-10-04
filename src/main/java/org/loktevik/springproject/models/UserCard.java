package org.loktevik.springproject.models;

import java.util.List;

public class UserCard {
    private Long userId;
    private List<Appointment> appointments;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
