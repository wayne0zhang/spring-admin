package com.paxing.springadmin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring cloud demo project
 * <p>
 * 服务注册中心
 *
 * @author wtzhang
 * @date 2019-06-18
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringadminApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringadminApplication.class).web(true).run(args);
    }
}
