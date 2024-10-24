package com.education.dto;

public class StudentDTO {
	
	private Long id;
	private String studentBio;
	private String qualification;
	private Boolean activeStatus;
	private Long userId;
	
	
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studentBio=" + studentBio + ", qualification=" + qualification
				+ ", activeStatus=" + activeStatus + ", userId=" + userId + "]";
	}

	
	public StudentDTO(Long id, String studentBio, String qualification, Boolean activeStatus, Long userId) {
		super();
		this.id = id;
		this.studentBio = studentBio;
		this.qualification = qualification;
		this.activeStatus = activeStatus;
		this.userId = userId;
	}

	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
