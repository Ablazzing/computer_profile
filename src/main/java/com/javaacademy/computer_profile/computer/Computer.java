package com.javaacademy.computer_profile.computer;

import com.javaacademy.computer_profile.computer.input.InputDevice;
import com.javaacademy.computer_profile.computer.output.OutputDevice;
import com.javaacademy.computer_profile.computer.system.OperationalSystem;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@ToString
@Slf4j
@Component
@RequiredArgsConstructor
public class Computer {
    private final InputDevice inputDevice;
    private final OutputDevice outputDevice;
    @Value("${app.country}")
    private String country;
    private final OperationalSystem operationalSystem;

    public void input(String data) {
        log.info("Запущен ввод информации в {}", country);
        inputDevice.input(data);
    }

    public void output() {
        log.info(outputDevice.output());
    }
}
