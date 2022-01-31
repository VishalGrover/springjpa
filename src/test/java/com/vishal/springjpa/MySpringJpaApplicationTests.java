package com.vishal.springjpa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class MySpringJpaApplicationTests {

	@Test
	void contextLoads() {
		Assert.hasLength("Hello", "No min length Met");
	}

}
