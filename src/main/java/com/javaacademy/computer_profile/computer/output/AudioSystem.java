package com.javaacademy.computer_profile.computer.output;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(value = {Monitor.class, Tv.class})
public class AudioSystem implements OutputDevice {
    @Override
    public String output() {
        return "Звук мощный издает";
    }
}
