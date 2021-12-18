package org.loktevik.springproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "doctor")
@AllArgsConstructor
@RequiredArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String number;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id", referencedColumnName = "id")
    private Login login;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Speciality speciality;

    @Override
    public String toString() {
        return "Name: " + name + ", Login: " + login + ", Speciality: " + speciality;
    }
}
