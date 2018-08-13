package com.bosssoft.consume.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class OrderServie {

    @Resource
    RestTemplate restTemplate;

    public String getTestPort(){

        return restTemplate.getForObject("http://provider-service/provider/port",String.class);
    }
}
