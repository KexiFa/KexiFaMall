package com.kexi.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
@Slf4j
@Api(tags = "测试模块")
public class HelloController {
    @GetMapping("/hellod")
    @PreAuthorize("hasAuthority('system:dept:index')")
    public String hello(){
        return "hello";
    }
}
