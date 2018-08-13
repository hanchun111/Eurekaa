package com.provider.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    String port;

    @GetMapping("/login")
    public String getPort(){


        return "当前端口："+port;

    }
}
