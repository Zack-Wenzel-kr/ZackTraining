package com.example.springrestpractice.Controller;

import com.example.springrestpractice.Model.LoginDetails;
import com.example.springrestpractice.Model.LoginResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login-service/v2")
public class LoginControllerV2 {

    private static List<LoginDetails> loginDetailsList = new ArrayList<>();

    @PostMapping(path = "/login")
    public LoginResult login(@RequestBody LoginDetails loginDetails) {
        LoginResult loginResult = new LoginResult();
        if(loginDetails.getUserName().trim().isEmpty() || loginDetails.getPassword().trim().isEmpty()) {
            loginResult.setMessage("Please provide both username and password");
        } else {
            Optional<LoginDetails> identifiedLoginDet =
                    loginDetailsList.stream().filter(existingOne -> existingOne.equals(loginDetails)).findFirst();
            if(identifiedLoginDet.isPresent()) {
                loginResult.setStatus(true);
            } else {
                loginResult.setMessage("Invalid username and password");
            }
        }
        return loginResult;
    }

    @PostMapping(path = "/register")
    public String register(@RequestBody LoginDetails loginDetails) {
        loginDetailsList.add(loginDetails);
        return "created successfully";
    }

    @GetMapping(path = "/register/all")
    public List<LoginDetails> getRegisteredUserDetails() {
        return loginDetailsList;
    }
}
