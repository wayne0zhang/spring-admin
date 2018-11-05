package com.paxing.springadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer // 启用spring boot admin
@SpringBootApplication
public class SpringadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringadminApplication.class, args);
    }
}
