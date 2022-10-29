package com.ll.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liuziqiang
 * @date 2022/01/20 21:04
 */

@ToString
public class Dog {

    private String name;

    private int age;

}