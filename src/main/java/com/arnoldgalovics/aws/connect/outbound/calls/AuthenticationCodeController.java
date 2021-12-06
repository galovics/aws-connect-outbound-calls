package com.arnoldgalovics.aws.connect.outbound.calls;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequiredArgsConstructor
public class AuthenticationCodeController {
    private final PhoneService phoneService;

    @PostMapping("/call-auth-code")
    public void callUserWithAuthCode() {
        String userPhoneNumber = "+12345678";
        int authCode = ThreadLocalRandom.current().nextInt(1_000, 10_000);
        phoneService.call(userPhoneNumber, "The following is your authentication code: " + authCode);
    }
}
