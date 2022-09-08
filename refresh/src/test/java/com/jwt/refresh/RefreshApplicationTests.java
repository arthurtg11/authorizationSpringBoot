package com.jwt.refresh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RefreshApplicationTests {

	@Test
	void contextLoads() {

		System.out.println("${app.filesdir}");
	}

}
