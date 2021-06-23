package com.example.web.controller;

import com.example.web.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 可以通过 @Value("${key}") 注解加载配置文件中的配置
 *
 * @author sweeney
 * @since 2021/06/23 10:25 created.
 */
@RestController
public class UserController {
    private final User user;
    @Value("${server.port}")
    private String port;

    public UserController(User user) {
        this.user = user;
    }

    @GetMapping("/user")
    public String getUser() {
        return "{port:" + port + "," + user + "}";
    }

}
