package com.bosssoft.hytrixtest.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

public class HytrixController {


    @Resource
    RestTemplate restTemplate;


    @GetMapping("/consumer")
    @HystrixCommand(fallbackMethod = "consumerFallback")
    public String consumer() {
        ResponseEntity<String> entity
                = restTemplate.getForEntity("http://localhost:9000/provider/getport" , String.class);
        return "调用服务返回值为：" + entity.getBody();
    }

    public String consumerFallback(String word) {
        return "word:" + word + ",熔断了!";
    }
}
