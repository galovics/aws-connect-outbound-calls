package com.arnoldgalovics.aws.connect.outbound.calls;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.connect.ConnectClient;

@Configuration
@EnableConfigurationProperties(AWSConnectConfigurationProperties.class)
public class AWSConnectConfiguration {
    @Bean
    public ConnectClient connectClient(AWSConnectConfigurationProperties properties) {
        return ConnectClient.builder()
                .region(Region.EU_CENTRAL_1)
                .build();
    }
}
