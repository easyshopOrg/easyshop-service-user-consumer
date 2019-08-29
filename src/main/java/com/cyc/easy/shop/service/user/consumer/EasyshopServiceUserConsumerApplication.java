package com.cyc.easy.shop.service.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//为了扫描到 commons-dubbo 中的 hystrixServlet 配置，需要改动包扫描位置
@SpringBootApplication(scanBasePackages = "com.cyc.easy.shop")
@EnableHystrixDashboard
@EnableHystrix
public class EasyshopServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyshopServiceUserConsumerApplication.class, args);
    }
}
