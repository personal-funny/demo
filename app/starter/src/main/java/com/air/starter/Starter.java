package com.air.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lx48475
 * @version Id: Starter.java, v 0.1 2017年07月31 16:36 lx48475 Exp $
 */
@Configuration
@ComponentScan("com.air")
@EnableAutoConfiguration
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
        System.out.println("Sample started ... ... OK!");
    }
}
