package com.education.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "User", schema = "public")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "emailId", nullable = false, length = 128)
	private String emailId;

	@Column(name = "mobileNumber", nullable = false)
	private String mobileNumber;

	@Column(name = "password", length = 256)
	private String password;

	@Column(name = "confirmPassword", length = 256)
	private String confirmPassword;

	@Column(name = "activeStatus")
	private Boolean activeStatus;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleId", referencedColumnName = "id")
    @JsonIgnore
	private Role role;

	@Column(name = "userProfile", length = 128)
	private String userProfile;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdDate")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", activeStatus=" + activeStatus + ", role=" + role + ", userProfile=" + userProfile
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}

	
	public User(Long id, String firstName, String lastName, String emailId, String mobileNumber, String password,
			String confirmPassword, Boolean activeStatus, Role role, String userProfile, Date createdDate,
			Date modifiedDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.activeStatus = activeStatus;
		this.role = role;
		this.userProfile = userProfile;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
