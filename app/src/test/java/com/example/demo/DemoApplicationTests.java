package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests {
	@Test
	void contextLoads() {

	}

	@Test
	void shouldUseHamcrestLibraryToMakeAnyTest() {
		String string1 = "Testing";
		String string2 = "Testing";
		assertThat(string1, equalTo(string2));
	}
}
