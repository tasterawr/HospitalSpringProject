package org.loktevik.springproject.services;

import org.loktevik.springproject.models.Registration;

import java.util.List;

public interface RegistrationService {
    Registration getRegistration(long id);

    List<Registration> getAllRegistrations();

    void saveRegistration(Registration registration);

    void updateRegistration(Registration registration);

    void deleteRegistration(long id);
}
