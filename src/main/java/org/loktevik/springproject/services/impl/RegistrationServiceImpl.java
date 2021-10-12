package org.loktevik.springproject.services.impl;

import org.loktevik.springproject.dao.RegistrationDAO;
import org.loktevik.springproject.models.Registration;
import org.loktevik.springproject.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService{
    private RegistrationDAO registrationDAO;

    @Autowired
    public RegistrationServiceImpl(RegistrationDAO registrationDAO){
        this.registrationDAO = registrationDAO;
    }

    public Registration getRegistration(long id){
        return new Registration();
    }

    public List<Registration> getAllRegistrations(){
        return new ArrayList<>();
    }

    public void saveRegistration(Registration registration){
        registrationDAO.save(registration);
    }

    public void updateRegistration(Registration registration){

    }

    public void deleteRegistration(long id){

    }
}
