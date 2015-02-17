package com.ydpp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author: john
 * @version: 1.0 2015-02-17 下午10:36
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.ydpp")
@EntityScan("com.ydpp.domain")
@EnableJpaRepositories("com.ydpp.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
