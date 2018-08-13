package com.bosssoft.consume.rest;

import com.bosssoft.consume.service.OrderServie;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
@RequestMapping("/consume")
public class OrderRest {

    @Resource
    OrderServie orderServie;

    @GetMapping("/getport")
    public String getTestPort(){

        return orderServie.getTestPort();
    }
}
