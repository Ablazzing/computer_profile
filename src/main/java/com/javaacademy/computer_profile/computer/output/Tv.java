package com.javaacademy.computer_profile.computer.output;

import lombok.ToString;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@ToString
@Component
@Profile("tv")
public class Tv implements OutputDevice {
    @Override
    public String output() {
        return "Телевизор вывел информацию";
    }
}
