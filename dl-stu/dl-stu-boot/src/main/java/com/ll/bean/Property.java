package com.ll.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

/**
 * @author liuziqiang
 * @date 2022/01/20 21:04
 */
@Data
@ToString
@RedisHash("cat")
public class Property {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Indexed
    private int age;

}