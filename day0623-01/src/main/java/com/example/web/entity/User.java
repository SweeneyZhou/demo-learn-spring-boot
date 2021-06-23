package com.example.web.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * -@Configuration 该注解使得该类成为一个配置类，
 * <p>
 * 通过 @ConfigurationProperties 从配置文件中注入属性值，设置该注解的prefix属性时，会从配置文件中寻找拥有该前缀的配置进行加载
 *
 * @author sweeney
 * @since 2021/06/23 10:37 created.
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "user")
public class User {
    private String username;
    private String password;
    private String address;
}
