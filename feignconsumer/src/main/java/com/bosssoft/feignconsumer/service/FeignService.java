package com.bosssoft.feignconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider-service")
public interface FeignService {

    @RequestMapping(value = "/provider/port",method = RequestMethod.GET)
    public String getPort();
}
