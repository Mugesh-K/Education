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
@Table(name = "Instructor", schema = "public")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "instructorBio", nullable = false, length = 128)
	private String instructorBio;
	
	@Column(name = "qualification")
	private String qualification;

    @Column(name = "numberOfCourses")
	private Integer numberOfCourses;

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

	public String getInstructorBio() {
		return instructorBio;
	}

	public void setInstructorBio(String instructorBio) {
		this.instructorBio = instructorBio;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getNumberOfCourses() {
		return numberOfCourses;
	}

	public void setNumberOfCourses(Integer numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
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
		return "Instructor [id=" + id + ", instructorBio=" + instructorBio + ", qualification=" + qualification
				+ ", numberOfCourses=" + numberOfCourses + ", activeStatus=" + activeStatus + ", user=" + user + "]";
	}

	
	public Instructor(Long id, String instructorBio, String qualification, Integer numberOfCourses,
			Boolean activeStatus, User user) {
		super();
		this.id = id;
		this.instructorBio = instructorBio;
		this.qualification = qualification;
		this.numberOfCourses = numberOfCourses;
		this.activeStatus = activeStatus;
		this.user = user;
	}

	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
