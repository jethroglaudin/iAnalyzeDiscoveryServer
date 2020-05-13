package com.iAnalyze.discovery.iAnalyzeDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IAnalyzeDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IAnalyzeDiscoveryServerApplication.class, args);
	}

}
