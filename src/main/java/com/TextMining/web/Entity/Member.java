package com.TextMining.web.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "Member")
public class Member {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	@Column(name = "ID",unique = true) @NotNull
	private String id;
	
	@Column(name = "PW") @NotNull
	private String pw;
	
	@Column(name = "Name") @NotNull
	private String name;
	
	@Column(name = "Mail",unique = true) @NotNull
	private String mail;
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Member(String id, String pw, String name, String mail) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.mail = mail;
	}
}
