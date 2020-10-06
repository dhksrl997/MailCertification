package com.TextMining.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {

	

	@GetMapping("/login")
	public String index() {

		return "login";
	}

	@PostMapping("/CheckLogin")
	public String checkLogin() {

		return "ok";
	}

	@GetMapping("/join")
	public String Join() {

		return "join";
	}

	@PostMapping("/joinMember")
	public String JoinMember() {
		return "login";
	}
}
