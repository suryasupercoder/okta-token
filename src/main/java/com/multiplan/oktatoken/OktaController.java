package com.multiplan.oktatoken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OktaController {
    @GetMapping("okta-hello")
    String getMessage() {
        return "Hello";
    }
}
