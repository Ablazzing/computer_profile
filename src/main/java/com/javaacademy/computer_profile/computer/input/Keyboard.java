package com.javaacademy.computer_profile.computer.input;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Slf4j
@ToString
@Component
@Profile("keyboard")
public class Keyboard implements InputDevice {
    @Override
    public void input(String data) {
        log.info("клавиатура ввела информацию: {}", data);
    }
}
