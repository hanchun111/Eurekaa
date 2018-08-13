package com.bosssoft.feignconsumer.controller;

import com.bosssoft.feignconsumer.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeiController {

    @Resource
    FeignService feignService;

    @GetMapping("/getport")
    public String getPort(){

        return feignService.getPort();
    }
}
