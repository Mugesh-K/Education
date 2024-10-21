package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "AboutPageSection3", schema = "public")
public class AboutPageSection3 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;

	@Column(name = "displayOrder", nullable = false)
	private Integer displayOrder;

	@Lob
	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "imageUrl")
	private String imageUrl;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	
	@Override
	public String toString() {
		return "AboutPageSection3 [id=" + id + ", title=" + title + ", displayOrder=" + displayOrder + ", description="
				+ description + ", imageUrl=" + imageUrl + "]";
	}

	
	public AboutPageSection3(Long id, String title, Integer displayOrder, String description, String imageUrl) {
		super();
		this.id = id;
		this.title = title;
		this.displayOrder = displayOrder;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	
	public AboutPageSection3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
