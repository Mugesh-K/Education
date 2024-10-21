package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Event", schema = "public")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "heading", nullable = false, length = 128)
	private String heading;

	@Column(name = "subContent", nullable = false, length = 128)
	private String subContent;

	@Column(name = "activeStatus")
	private Boolean activeStatus;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getSubContent() {
		return subContent;
	}

	public void setSubContent(String subContent) {
		this.subContent = subContent;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	
	@Override
	public String toString() {
		return "Events [id=" + id + ", heading=" + heading + ", subContent=" + subContent + ", activeStatus="
				+ activeStatus + "]";
	}

	
	public Event(Long id, String heading, String subContent, Boolean activeStatus) {
		super();
		this.id = id;
		this.heading = heading;
		this.subContent = subContent;
		this.activeStatus = activeStatus;
	}

	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
