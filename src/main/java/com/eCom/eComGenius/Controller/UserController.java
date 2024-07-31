package com.eCom.eComGenius.Controller;

import com.eCom.eComGenius.Dto.UserRequest;
import com.eCom.eComGenius.Entity.User;
import com.eCom.eComGenius.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(){
        return "Welcome to E-commerce project";
    }

    @PostMapping("/user/create-user")
    public ResponseEntity<User> createEmployee(@RequestBody @Valid UserRequest userRequest){
        User createdUser=userService.createNewUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
