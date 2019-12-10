package com.zhang.dianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = {"com.zhang.dianping"})
@MapperScan("com.zhang.dianping.dal")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class VegaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VegaApplication.class, args);
	}

}
