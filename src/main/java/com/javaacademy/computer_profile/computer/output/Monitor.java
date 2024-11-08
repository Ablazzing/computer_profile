package com.javaacademy.computer_profile.computer.output;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;

@Slf4j
@ToString
@Profile("monitor")
public class Monitor implements OutputDevice {
    @Override
    public String output() {
        return "Монитор вывел картинку";
    }
}
