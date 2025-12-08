package com.binnaLibrary.BinnaLib.Service;

import com.binnaLibrary.BinnaLib.Model.users;
import com.binnaLibrary.BinnaLib.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    JWTService jwtService;

    @Autowired
    AuthenticationManager authManager;

    @Autowired
    UsersRepo repos;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public users register(users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repos.save(user);
    }

    public String verify(users user) {
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken
                (user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        }else {
            return "fail";
        }
    }
}
