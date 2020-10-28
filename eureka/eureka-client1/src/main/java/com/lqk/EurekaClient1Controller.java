package com.lqk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lqk
 * @Date 2020/10/27
 * @Description 微服务1 - 测试用controller
 */
@RestController
public class EurekaClient1Controller {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }
}
