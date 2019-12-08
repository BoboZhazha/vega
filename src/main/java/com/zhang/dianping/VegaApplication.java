package com.zhang.dianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zhang.dianping"})
@MapperScan("com.zhang.dianping.dal")
public class VegaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VegaApplication.class, args);
    }

}
