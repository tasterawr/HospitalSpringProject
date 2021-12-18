package org.loktevik.springproject.controllers;

import lombok.RequiredArgsConstructor;
import org.loktevik.springproject.models.Role;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SignInController {

    @GetMapping(value = "/sign-in")
    public String getsignInForm() {
        return "sign_in";
    }

    @GetMapping(value = "/client")
    public String redirect() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getAuthorities().contains(Role.USER)) {
            return "redirect:/user/home";
        } else {
            return "redirect:/doctor/home";
        }
    }
}