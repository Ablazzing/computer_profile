package com.javaacademy.computer_profile.computer.config;

import com.javaacademy.computer_profile.computer.input.Keyboard;
import com.javaacademy.computer_profile.computer.output.Monitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("monitor_plus_keyboard")
public class MonitorKeyboardConfig {

    @Bean
    public Keyboard keyboard() {
        return new Keyboard();
    }

    @Bean
    public Monitor monitor() {
        return new Monitor();
    }
}
