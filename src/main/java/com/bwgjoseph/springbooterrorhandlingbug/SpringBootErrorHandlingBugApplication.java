package com.bwgjoseph.springbooterrorhandlingbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootErrorHandlingBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootErrorHandlingBugApplication.class, args);
	}

}

@RestController
class BugController {
	@GetMapping("/bug")
	public void get() {
		throw new RuntimeException("testing");
	}
}
