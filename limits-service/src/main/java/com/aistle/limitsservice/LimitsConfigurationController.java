package com.aistle.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @GetMapping("limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(1000, 1);
    }
}
