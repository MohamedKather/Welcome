package com.example.welcome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
	@RequestMapping("/welcome")
	String welcome() {
		return "Welcome To Home";
	}

}
