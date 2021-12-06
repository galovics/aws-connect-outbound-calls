package com.arnoldgalovics.aws.connect.outbound.calls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class AwsConnectOutboundCallsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsConnectOutboundCallsApplication.class, args);
	}

}
