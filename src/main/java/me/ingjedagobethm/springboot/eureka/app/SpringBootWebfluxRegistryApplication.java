package me.ingjedagobethm.springboot.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootWebfluxRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxRegistryApplication.class, args);
	}

}
