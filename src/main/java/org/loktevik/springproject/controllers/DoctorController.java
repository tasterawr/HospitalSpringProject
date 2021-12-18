package org.loktevik.springproject.controllers;

import lombok.RequiredArgsConstructor;
import org.loktevik.springproject.models.Login;
import org.loktevik.springproject.models.Doctor;
import org.loktevik.springproject.models.Speciality;
import org.loktevik.springproject.services.DoctorService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("doctor")
@Transactional
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("home")
    public ModelAndView homePage(){
        Doctor doctor = doctorService.getDoctorByLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        ModelAndView modelAndView = new ModelAndView("doctor_home");
        modelAndView.addObject("name", doctor.getName());
        modelAndView.addObject("login", doctor.getLogin());
        modelAndView.addObject("phone", doctor.getNumber());
        modelAndView.addObject("email", doctor.getEmail());
        modelAndView.addObject("speciality", doctor.getSpeciality());
        return modelAndView;
    }

    @GetMapping(value = "/add-doctor")
    public ModelAndView addDoctorPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView modelAndView = new ModelAndView("add_doctor");
        modelAndView.addObject("speciality", Arrays.asList(Speciality.values()));
        return modelAndView;
    }

    @GetMapping(value = "update-doctor")
    public ModelAndView updateDoctorPage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        return new ModelAndView("update_doctor");
    }

    @GetMapping(value = "delete-doctor")
    public ModelAndView deleteDoctorPage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        return new ModelAndView("delete_doctor");
    }

    @PostMapping(value = "/add-doctor")
    public ModelAndView addDoctorRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String speciality = request.getParameter("speciality");
        addNewDoctor(name, number, email, login, password, speciality);

        return new ModelAndView("add_doctor");
    }

    @GetMapping(value = "/get-doctors")
    public ModelAndView getDoctorsRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<Doctor> doctors = doctorService.getAllDoctors();

        ModelAndView modelAndView = new ModelAndView("get_all_doctors");
        modelAndView.addObject("doctors", doctors);
        return modelAndView;
    }

    @PostMapping(value = "/update-doctor")
    public ModelAndView updateDoctorRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String parameter = request.getParameter("parameter");
        String newValue = request.getParameter("newValue");
        updateDoctor(parameter, newValue);

        return new ModelAndView("update_doctor");
    }

    @PostMapping(value = "/delete-doctor")
    public String deleteDoctorRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doctorService.deleteDoctorByLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        return "redirect:/logout";
    }

    private void addNewDoctor(String name, String number, String email, String login, String password, String speciality){
        Doctor doctor = new Doctor();
        doctor.setName(name);
        doctor.setNumber(number);
        doctor.setEmail(email);
        doctor.setLogin(new Login(0, login, null, null));
        doctor.setPassword(password);
        doctor.setSpeciality(Speciality.valueOf(speciality));

        doctorService.saveDoctor(doctor);
    }

    private void updateDoctor(String parameter, String newValue){
        doctorService.updateDoctor(SecurityContextHolder.getContext().getAuthentication().getName(), parameter, newValue);
    }
}
