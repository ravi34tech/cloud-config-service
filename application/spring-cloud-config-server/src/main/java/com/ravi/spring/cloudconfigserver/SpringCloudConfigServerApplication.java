package com.ravi.spring.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		System.out.println("Cloud Server application started successfully .....");

	}

}
