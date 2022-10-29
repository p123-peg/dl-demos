package com.ll.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liuziqiang
 * @date 2022/01/20 21:04
 */

@Data
@ToString
public class Cat {
    private String name;
    private int age;

}