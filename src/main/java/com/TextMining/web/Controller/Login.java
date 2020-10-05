package com.TextMining.web.Controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {

	@Autowired
	private JavaMailSender javaMailSender;

	@GetMapping("login")
	public String index() {

		return "login";
	}

	@PostMapping("CheckLogin")
	public String checkLogin() {

		return "ok";
	}

	@GetMapping("join")
	public String Join() {

		return "join";
	}

	@PostMapping("CheckMail")
	@ResponseBody
	public void SendMail(String mail) {
		Random random=new Random();
		String key="";

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mail); //스크립트에서 보낸 메일을 받을 사용자 이메일 주소 
		//입력 키를 위한 코드
		for(int i =0; i<3;i++) {
			int index=random.nextInt(25)+65; //A~Z까지 랜덤 알파벳 생성
			key+=(char)index;
		}
		int numIndex=random.nextInt(9999)+1000; //4자리 정수를 생성
		key+=numIndex;
		message.setSubject("인증번호 입력을 위한 메일 전송");
		message.setText("인증 번호 : "+key);
		javaMailSender.send(message);
	}

	@PostMapping("joinMember")
	public String JoinMember() {
		return "login";
	}
}