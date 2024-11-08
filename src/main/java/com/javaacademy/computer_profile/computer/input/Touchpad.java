package com.javaacademy.computer_profile.computer.input;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConditionalOnMissingBean(value =  {Keyboard.class, Mouse.class})
public class Touchpad implements InputDevice {
    public Touchpad() {
        System.out.println();
    }

    @Override
    public void input(String data) {
        log.info("Тачпад печатает {}", data);
    }
}
