package com.binnaLibrary.BinnaLib.Controller;

import com.binnaLibrary.BinnaLib.Model.users;
import com.binnaLibrary.BinnaLib.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public users register (@RequestBody users user){
        return service.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody users user) {
        return service.verify(user);
    }
}
