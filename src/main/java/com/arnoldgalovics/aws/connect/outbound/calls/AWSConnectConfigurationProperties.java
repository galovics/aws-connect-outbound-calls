package com.arnoldgalovics.aws.connect.outbound.calls;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("aws.connect")
@Data
public class AWSConnectConfigurationProperties {
    private String instanceId;
    private String contactFlowId;
    private String queueId;
}
