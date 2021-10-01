package com.jasekraft.daikichi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
@RequestMapping("/daikichi")
class DaikichiApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@RequestMapping("/today")
	public String testing() {
		return "Today you will find luck in all your endeavors!";
	}

}
