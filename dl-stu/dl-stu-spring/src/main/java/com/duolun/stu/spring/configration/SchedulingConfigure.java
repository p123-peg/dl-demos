//package com.duolun.stu.spring.configration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//import java.util.concurrent.*;
///**
// * @author liuziqiang
// * @date 2021/12/03 17:02
// */
//@EnableAsync
//@Configuration
//public class SchedulingConfigure {
//    /**核心线程数*/
//    int corePoolSize = 3;
//   /**最大线程数*/
//    int maximumPoolSize = 6;
//        @Bean
//        public Executor taskExecutor() {
//            //指定定时任务线程数量，可根据需求自行调节
//            ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//            executor.setCorePoolSize(corePoolSize);
//            executor.setMaxPoolSize(maximumPoolSize);
//            executor.setQueueCapacity(2);
//            executor.initialize();
//            return executor;
//        }
//
//}