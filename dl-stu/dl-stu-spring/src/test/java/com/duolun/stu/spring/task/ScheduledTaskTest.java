package com.duolun.stu.spring.task;


import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author liuziqiang
 * @date 2021/12/03 15:37
 */

public class ScheduledTaskTest {

//    @Test
//    void contextLoads() {
//
//
//    }
    @Test
    public void testTime(){
        System.out.println( DateUtil.now());
    }

}