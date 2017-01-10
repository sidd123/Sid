package com.LearnersBuzz.Beans;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

public class UserLogin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6099863630528486645L;
	@Transient
	private String username;
	@Transient
	private String password;

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
