package com.travelmaker;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {MybatisAutoConfiguration.class})
public class TravelMakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelMakerApplication.class, args);
	}

}
