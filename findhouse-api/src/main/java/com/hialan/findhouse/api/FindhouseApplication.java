package com.hialan.findhouse.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * User: Alan
 * Email: houlong.yang@shuyun.com
 * Date: 14:31 7/7/16
 */
@SpringBootApplication(scanBasePackages = {"com.hialan.findhouse.api"})
public class FindhouseApplication {
	public static void main(String[] args) {
		SpringApplication.run(FindhouseApplication.class, args);
	}
}
