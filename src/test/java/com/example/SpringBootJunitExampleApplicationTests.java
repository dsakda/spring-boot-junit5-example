package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootJunitExampleApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Test hello RESTful API")
	void contextLoads() {
		String message = this.restTemplate.getForObject("/hello", String.class);
		assertEquals("Hello Spring Boot", message);
	}

}
