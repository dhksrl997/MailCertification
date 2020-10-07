package com.TextMining.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TextMining.web.Entity.Member;
import com.TextMining.web.Entity.MemberRepository;

@Controller
public class UserController {
	
	@Autowired
	private MemberRepository repo;

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

	@PostMapping("/join")
	public String JoinMember(@RequestParam(name = "id",required = true)String id,
			@RequestParam(name = "pw",required = true)String pw,
			@RequestParam(name="name",required = true)String name,
			@RequestParam(name="mail",required = true)String mail,
			@RequestParam(name = "domain")String domain) {
		Member member= new Member(id, pw, name, mail+"@"+domain);
		
		repo.save(member);
		return "login";
	}
}
