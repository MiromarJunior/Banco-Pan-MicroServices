package com.luiza.microcalculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@RibbonClient(name = "micro-tabela")
@EnableFeignClients
@SpringBootApplication
public class MicroCalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCalculadoraApplication.class, args);
	}

}
