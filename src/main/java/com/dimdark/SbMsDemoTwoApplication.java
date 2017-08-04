package com.dimdark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dimdark.dao")
public class SbMsDemoTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMsDemoTwoApplication.class, args);
	}

}
