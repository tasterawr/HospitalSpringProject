package org.loktevik.springproject.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.loktevik.springproject.models.Speciality;
import org.loktevik.springproject.repository.DoctorRepository;
import org.loktevik.springproject.models.Doctor;
import org.loktevik.springproject.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DoctorServiceImpl implements DoctorService{
    private final DoctorRepository doctorRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @SneakyThrows
    public Doctor getDoctorByLogin(String login) {
        return doctorRepository.findDoctorByLoginLogin(login).orElseThrow(Exception::new);
    }

    @Override
    public Doctor getDoctor(long id) {
        return doctorRepository.getById(id);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        doctor.setPassword(passwordEncoder.encode(doctor.getPassword()));
        doctorRepository.save(doctor);
    }

    @Override
    @SneakyThrows
    public void updateDoctor(String login, String type, String newValue) {
        Doctor doctor = doctorRepository.findDoctorByLoginLogin(login).orElseThrow(Exception::new);

        if (type.equals("name")) {
            doctor.setName(newValue);
        } else if (type.equals("number")) {
            doctor.setNumber(newValue);
        } else if (type.equals("email")) {
            doctor.setEmail(newValue);
        } else if (type.equals("password")) {
            doctor.setPassword(passwordEncoder.encode(newValue));
        } else if (type.equals("speciality")){
            Speciality spec = Arrays.asList(Speciality.values()).stream()
                    .filter(speciality -> speciality.toString().equals(newValue))
                    .findFirst()
                    .orElse(null);

            if (spec != null)
                doctor.setSpeciality(spec);
        }

        doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    @SneakyThrows
    public void deleteDoctorByLogin(String login) {
        Doctor doctor = doctorRepository.findDoctorByLoginLogin(login).orElseThrow(Exception::new);
        doctorRepository.deleteById(doctor.getId());
    }
}
