package com.learning.eureka;

import com.learning.eureka.config.LoginConfig;
import com.learning.eureka.model.LoginDetails;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirement(name = "basicAuth")
public class LoginController {

@Autowired
LoginConfig loginConfig;
    @GetMapping("/logindetails")
    public LoginDetails getLoginDetails(){
        return new LoginDetails(loginConfig.getAuthUrl(),loginConfig.getLoginUrl());
    }
}
