package com.bosssoft.feignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import sun.rmi.runtime.Log;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignconsumerApplication.class, args);

    }
}
