package com.education.dto;

public class InstructorDTO {
	
	private Long id;
	private String instructorBio;
	private String qualification;
	private Integer numberOfCourses;
	private Boolean activeStatus;
	private Long userId;
	
	
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	@Override
	public String toString() {
		return "InstructorDTO [id=" + id + ", instructorBio=" + instructorBio + ", qualification=" + qualification
				+ ", numberOfCourses=" + numberOfCourses + ", activeStatus=" + activeStatus + ", userId=" + userId
				+ "]";
	}
	
	
	public InstructorDTO(Long id, String instructorBio, String qualification, Integer numberOfCourses,
			Boolean activeStatus, Long userId) {
		super();
		this.id = id;
		this.instructorBio = instructorBio;
		this.qualification = qualification;
		this.numberOfCourses = numberOfCourses;
		this.activeStatus = activeStatus;
		this.userId = userId;
	}
	
	
	public InstructorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
