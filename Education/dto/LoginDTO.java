package com.education.dto;

public class LoginDTO {

	private String emailId;
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [emailId=" + emailId + ", password=" + password + "]";
	}

	public LoginDTO(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
