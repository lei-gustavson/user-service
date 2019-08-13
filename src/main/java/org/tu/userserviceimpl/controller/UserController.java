package org.tu.userserviceimpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tu.userserviceimpl.dto.AuthenticateUserDto;
import org.tu.userserviceimpl.dto.RegisterUserDto;
import org.tu.userserviceimpl.dto.UserDto;
import org.tu.userserviceimpl.service.UserAuthenticationService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserAuthenticationService userService;

    @Autowired
    public UserController(UserAuthenticationService userService) {
        this.userService = userService;
    }

    @PostMapping(value = { "/logUser" })
    public UserDto logUser(@RequestBody AuthenticateUserDto authenticateUserDto) throws Exception {
        return userService.logUser(authenticateUserDto);
    }

    @PostMapping(value = { "/register" })
    public UserDto register(@RequestBody RegisterUserDto registerUserDto) throws Exception {
        return userService.registerUser(registerUserDto);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
