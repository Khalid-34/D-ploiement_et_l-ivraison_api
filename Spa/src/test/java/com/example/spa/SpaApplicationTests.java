package com.example.spa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpaApplicationTests {

	@Test
	void contextLoads() {

		@Autowired
		private SpaApplication weather;

		@Autowired
		private TestRestTemplate restTemplate;

		@LocalServerPort
		private int port;

		@Test
		void contextLoads() {

			assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/weather/",
					String.class)).isNotEmpty();

		}
	}

}
