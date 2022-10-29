//package com.duolun.stu.spring.task;
//
//import cn.hutool.core.date.DateUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
///**
// * @author liuziqiang
// * @date 2021/12/03 15:08
// */
//@Component
//@Slf4j
//public class ScheduledTask {
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void task1() throws InterruptedException {
//        log.info("task1, current thread: {} {}", Thread.currentThread().getName(),DateUtil.now());
//        while (true) {
//            //模拟耗时任务，阻塞10s
//            Thread.sleep(10000);
//            break;
//        }
//    }
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void task2() {
//        log.info("task2, current thread: {} {}", Thread.currentThread().getName(),DateUtil.now());
//    }
//}
//
