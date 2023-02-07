package com.example.springrestpractice.Controller;

import com.example.springrestpractice.Model.LoginDetails;
import com.example.springrestpractice.Model.LoginResult;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login-service")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public LoginResult login(@RequestBody LoginDetails loginDetails) {
        LoginResult loginResult = new LoginResult();
        if(loginDetails.getUserName().equals("admin") && loginDetails.getPassword().equals("admin")) {
            loginResult.setStatus(true);
        } else {
            loginResult.setStatus(false);
            loginResult.setMessage("Invalid username/password!");
        }
        return loginResult;
    }
}