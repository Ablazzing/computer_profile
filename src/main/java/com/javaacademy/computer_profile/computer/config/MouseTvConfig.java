package com.javaacademy.computer_profile.computer.config;

import com.javaacademy.computer_profile.computer.input.Mouse;
import com.javaacademy.computer_profile.computer.output.Tv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mouse_tv")
public class MouseTvConfig {

    @Bean
    public Mouse mouse() {
        return new Mouse();
    }

    @Bean
    public Tv tv() {
        return new Tv();
    }
}
