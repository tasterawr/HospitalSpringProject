package org.loktevik.springproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "logins")
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    @Id
    @GeneratedValue
    private long id;

    private String login;

    @OneToOne(mappedBy = "login")
    private User user;

    @OneToOne(mappedBy = "login")
    private Doctor doctor;

    @Override
    public String toString() {
        return login;
    }
}