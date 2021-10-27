package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.repository.RegistrationRepository;
import org.loktevik.springproject.models.Registration;
import org.loktevik.springproject.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RegistrationServiceImpl implements RegistrationService{
    private RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationServiceImpl(RegistrationRepository registrationRepository){
        this.registrationRepository = registrationRepository;
    }

    public Registration getRegistration(long id){
        return new Registration();
    }

    public List<Registration> getAllRegistrations(){
        return new ArrayList<>();
    }

    public void saveRegistration(Registration registration){
        registrationRepository.save(registration);
    }

    public void updateRegistration(Registration registration){

    }

    public void deleteRegistration(long id){

    }
}
