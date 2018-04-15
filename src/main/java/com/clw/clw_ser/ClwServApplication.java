package com.clw.clw_ser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clw.clw_ser.mapper")
public class ClwServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClwServApplication.class, args);
	}
}
