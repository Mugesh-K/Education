package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HomePageSection2", schema = "public")
public class HomePageSection2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "program1", nullable = false, length = 256)
	private String program1;

	@Column(name = "program2", nullable = false, length = 256)
	private String program2;
	
	@Column(name = "program3", nullable = false, length = 256)
	private String program3;

	@Column(name = "buzzTitle", nullable = false, length = 128)
	private String buzzTitle;

	@Column(name = "button", nullable = false, length = 128)
	private String button;
	
	@Column(name = "displayOrder", nullable = false)
	private Integer displayOrder;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProgram1() {
		return program1;
	}

	public void setProgram1(String program1) {
		this.program1 = program1;
	}

	public String getProgram2() {
		return program2;
	}

	public void setProgram2(String program2) {
		this.program2 = program2;
	}

	public String getProgram3() {
		return program3;
	}

	public void setProgram3(String program3) {
		this.program3 = program3;
	}

	public String getBuzzTitle() {
		return buzzTitle;
	}

	public void setBuzzTitle(String buzzTitle) {
		this.buzzTitle = buzzTitle;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	
	@Override
	public String toString() {
		return "HomePageSection2 [id=" + id + ", program1=" + program1 + ", program2=" + program2 + ", program3="
				+ program3 + ", buzzTitle=" + buzzTitle + ", button=" + button + ", displayOrder=" + displayOrder + "]";
	}

	
	public HomePageSection2(Long id, String program1, String program2, String program3, String buzzTitle, String button,
			Integer displayOrder) {
		super();
		this.id = id;
		this.program1 = program1;
		this.program2 = program2;
		this.program3 = program3;
		this.buzzTitle = buzzTitle;
		this.button = button;
		this.displayOrder = displayOrder;
	}

	
	public HomePageSection2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
