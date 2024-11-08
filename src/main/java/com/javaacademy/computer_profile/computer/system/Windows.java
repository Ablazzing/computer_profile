package com.javaacademy.computer_profile.computer.system;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name = "app.system", havingValue = "windows")
//@ConditionalOnExpression(value = "${app.system} == 'windows' && ")
public class Windows implements OperationalSystem {
}
