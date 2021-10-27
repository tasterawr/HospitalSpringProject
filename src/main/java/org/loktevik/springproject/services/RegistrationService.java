package org.loktevik.springproject.services;

import org.loktevik.springproject.models.Registration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("registrationService")
public interface RegistrationService {
    Registration getRegistration(long id);

    List<Registration> getAllRegistrations();

    void saveRegistration(Registration registration);

    void updateRegistration(Registration registration);

    void deleteRegistration(long id);
}
