package com.samacorporation.ihm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class IhmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhmApplication.class, args);
	}

	@GetMapping(name = "index", value = "/index")
	public String index() {
		return "index";
	}
}
