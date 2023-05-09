package com.kexi.controller;

import com.kexi.basic.ResponseResult;
import com.kexi.entity.User;
import com.kexi.service.ILoginServcie;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
@Slf4j
public class LoginController {
    @Autowired
    private ILoginServcie loginServcie;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return loginServcie.login(user);
    }

    @PostMapping("/hello")
    public  String  testHello(){
        return "hello";
    }
}
