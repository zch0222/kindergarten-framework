package com.kindergarten.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 *
 * @author 称霸幼儿园
 */
@SpringBootApplication
public class KindergartenSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(KindergartenSystemApplication.class, args);
        System.out.println("系统模块启动成功");
    }
}
