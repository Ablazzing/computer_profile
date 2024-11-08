package com.javaacademy.computer_profile;

import com.javaacademy.computer_profile.computer.Computer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class ComputerProfileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ComputerProfileApplication.class, args);

		Computer computer = context.getBean(Computer.class);
		computer.input("Инфа какая то");
		computer.output();
		log.info(computer.toString());


	}

}
