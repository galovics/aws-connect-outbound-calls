package com.arnoldgalovics.aws.connect.outbound.calls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.connect.ConnectClient;
import software.amazon.awssdk.services.connect.model.StartOutboundVoiceContactRequest;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PhoneService {
    private final AWSConnectConfigurationProperties properties;
    private final ConnectClient connectClient;

    public void call(String number, String text) {
        StartOutboundVoiceContactRequest request = StartOutboundVoiceContactRequest.builder()
                .instanceId(properties.getInstanceId())
                .contactFlowId(properties.getContactFlowId())
                .queueId(properties.getQueueId())
                .destinationPhoneNumber(number)
                .attributes(Map.of("promptText", text))
                .build();

        connectClient.startOutboundVoiceContact(request);
    }
}
