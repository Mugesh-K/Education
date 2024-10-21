package com.education.dto;

import java.util.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class UserDTO {

	private Long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;
	private String confirmPassword;
	private Boolean activeStatus;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	private Integer modifiedById;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getModifiedById() {
		return modifiedById;
	}

	public void setModifiedById(Integer modifiedById) {
		this.modifiedById = modifiedById;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", activeStatus=" + activeStatus + ", createdDate=" + createdDate
				+ ", modifiedById=" + modifiedById + ", modifiedDate=" + modifiedDate + "]";
	}

	public UserDTO(Long userId, String firstName, String lastName, String emailId, String mobileNumber, String password,
			String confirmPassword, Boolean activeStatus, Date createdDate, Integer modifiedById, Date modifiedDate) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.activeStatus = activeStatus;
		this.createdDate = createdDate;
		this.modifiedById = modifiedById;
		this.modifiedDate = modifiedDate;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
