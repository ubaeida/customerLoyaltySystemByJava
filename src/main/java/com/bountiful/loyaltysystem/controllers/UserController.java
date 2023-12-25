package com.bountiful.loyaltysystem.controllers;


import com.bountiful.loyaltysystem.persistence.entities.UserEntity;
import com.bountiful.loyaltysystem.services.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserEntity addNewUser(@ModelAttribute @Valid UserEntity userEntity) {

        return userService.saveUser(userEntity);
    }
}