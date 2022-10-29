package com.duolun.stu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author liuziqiang
 * @date 2021/12/03 15:01
 */
@SpringBootApplication
@EnableScheduling
public class SpringServiecApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringServiecApplication.class,args);
    }

}