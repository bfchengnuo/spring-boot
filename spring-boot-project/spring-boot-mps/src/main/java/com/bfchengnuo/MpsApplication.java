package com.bfchengnuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author 冰封承諾Andy
 * @date 2020/7/14
 */
@SpringBootApplication
public class MpsApplication {
	public static void main(String[] args) {
		// SpringApplication.run(MpsApplication.class, args);
		simpleApp(args);
	}

	private static void simpleApp(String[] args) {
		new SpringApplicationBuilder(MpsApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}
}
