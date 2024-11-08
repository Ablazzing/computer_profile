package com.javaacademy.computer_profile;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"mouse", "tv"})
class ComputerProfileApplicationTests {

	@Test
	void contextLoads() {
	}

}
