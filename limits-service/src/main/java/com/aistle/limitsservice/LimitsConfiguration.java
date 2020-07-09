package com.aistle.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LimitsConfiguration {
    private int maximum;
    private int minimum;
}
