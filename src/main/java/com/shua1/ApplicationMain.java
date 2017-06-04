package com.shua1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationMain {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);
	

	public static void main(String[] args) {
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>СӨ�յ� WEB����������...");
		
		ApplicationContext applicationContext = SpringApplication.run(ApplicationMain.class, args);
		RedisUtil redisUtil = applicationContext.getBean(RedisUtil.class);
		log.info("");
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>СӨ�յ� WEB���������ɹ� (^_^)");
	}
}
