package com.lqk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lqk
 * @Date 2020/10/28
 * @Description
 */
@RestController
public class EurekaClient2Controller {

    @Autowired
    private RestTemplate restTemplate;


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @GetMapping(value = "/testHello")
    public String testHello(){
        String result = restTemplate.getForObject("http://EUREKA-CLIENT1/hello", String.class);
        return "The Result Is : " + result;
    }
}
