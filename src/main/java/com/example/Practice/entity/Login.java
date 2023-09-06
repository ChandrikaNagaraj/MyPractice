package com.example.Practice.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="login")

public class Login {
	private int loginid;
	private Date logindate;
	@OneToMany()
	private User userdetails;

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public Date getLogindate() {
		return logindate;
	}

	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}

	public User getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(User userdetails) {
		this.userdetails = userdetails;
	}

}
