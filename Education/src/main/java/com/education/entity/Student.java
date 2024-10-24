package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student", schema = "public")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "studentBio")
	private String studentBio;
	
	@Column(name = "qualification")
	private String qualification;

	@Column(name = "activeStatus")
	private Boolean activeStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId", referencedColumnName = "id")
	private User user;

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentBio() {
		return studentBio;
	}

	public void setStudentBio(String studentBio) {
		this.studentBio = studentBio;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentBio=" + studentBio + ", qualification=" + qualification
				+ ", activeStatus=" + activeStatus + ", user=" + user + "]";
	}

	
	public Student(Long id, String studentBio, String qualification, Boolean activeStatus, User user) {
		super();
		this.id = id;
		this.studentBio = studentBio;
		this.qualification = qualification;
		this.activeStatus = activeStatus;
		this.user = user;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
