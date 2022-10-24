package com.test.shareGarden.application.login;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Resource
    private LoginService loginService;


    @PostMapping("/register")
    @Operation(summary = "Sign up new user")
    public RegisterResponse registerNewUser(@RequestBody RegisterRequest request) {
        return loginService.registerNewUser(request);
    }

    @PostMapping("/login")
    @Operation(summary = "Admin and user login")
    public LogInResponse logIn(@RequestBody LogInRequest request) {
        return loginService.logIn(request);
    }


}




