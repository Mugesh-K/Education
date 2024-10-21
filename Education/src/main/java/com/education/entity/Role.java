package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Role", schema = "public")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "name", nullable = false, length = 128)
	private String name;

	@Column(name = "activeStatus")
	private Boolean activeStatus;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "Role [id=" + id + ", name=" + name + ", activeStatus=" + activeStatus + "]";
	}

	
	public Role(Integer id, String name, Boolean activeStatus) {
		super();
		this.id = id;
		this.name = name;
		this.activeStatus = activeStatus;
	}

	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
