package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categories", schema = "public")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "category_seq")
	@SequenceGenerator(name = "category_seq", sequenceName = "category_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false, length = 128)
	private String name;

	@Column(name = "activeStatus")
	private Boolean activeStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	
	@Override
	public String toString() {
		return "Categories [id=" + id + ", name=" + name + ", activeStatus=" + activeStatus + "]";
	}

	
	public Categories(Long id, String name, Boolean activeStatus) {
		super();
		this.id = id;
		this.name = name;
		this.activeStatus = activeStatus;
	}

	
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
