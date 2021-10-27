package org.loktevik.springproject.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_card")
public class UserCard {
    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "usercard")
    private List<Appointment> appointments;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
