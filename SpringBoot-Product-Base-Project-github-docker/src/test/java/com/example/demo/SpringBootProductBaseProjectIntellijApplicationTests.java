package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"})

class SpringBootProductBaseProjectIntellijApplicationTests {

	@Test
	void contextLoads() {
	}

}
