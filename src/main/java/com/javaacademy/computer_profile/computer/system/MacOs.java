package com.javaacademy.computer_profile.computer.system;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(value = Windows.class)
public class MacOs implements OperationalSystem {
}
