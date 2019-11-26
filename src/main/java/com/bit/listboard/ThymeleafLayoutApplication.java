package com.bit.listboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bit.listboard.mapper")
public class ThymeleafLayoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafLayoutApplication.class, args);
	}

}
