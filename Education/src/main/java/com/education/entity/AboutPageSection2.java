package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "AboutPageSection2", schema = "public")
public class AboutPageSection2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Lob
	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "ourMission", nullable = false, length = 256)
	private String ourMission;
	
	@Column(name = "ourVision", nullable = false, length = 256)
	private String ourVision;
	
	@Column(name = "displayOrder", nullable = false)
	private Integer displayOrder;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOurMission() {
		return ourMission;
	}

	public void setOurMission(String ourMission) {
		this.ourMission = ourMission;
	}

	public String getOurVision() {
		return ourVision;
	}

	public void setOurVision(String ourVision) {
		this.ourVision = ourVision;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	
	@Override
	public String toString() {
		return "AboutPageSection2 [id=" + id + ", description=" + description + ", ourMission=" + ourMission
				+ ", ourVision=" + ourVision + ", displayOrder=" + displayOrder + "]";
	}

	
	public AboutPageSection2(Long id, String description, String ourMission, String ourVision, Integer displayOrder) {
		super();
		this.id = id;
		this.description = description;
		this.ourMission = ourMission;
		this.ourVision = ourVision;
		this.displayOrder = displayOrder;
	}

	
	public AboutPageSection2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
