package com.mock.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.exception.UserException;
import com.mock.model.Email;
import com.mock.model.User;
import com.mock.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
   
    private  UserService userService;

}
