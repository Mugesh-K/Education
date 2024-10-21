package com.education.dto;

import jakarta.persistence.Lob;

public class BlogDTO {
	
	private Long id;
	private String title;
	private Long categoryId;
	private String shortDescription;
	@Lob
	private String description;
	private String imageUrl;
	private Boolean activeStatus;
	
	
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

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	
	@Override
	public String toString() {
		return "BlogDTO [id=" + id + ", title=" + title + ", categoryId=" + categoryId + ", shortDescription="
				+ shortDescription + ", description=" + description + ", imageUrl=" + imageUrl + ", activeStatus="
				+ activeStatus + "]";
	}

	
	public BlogDTO(Long id, String title, Long categoryId, String shortDescription, String description, String imageUrl,
			Boolean activeStatus) {
		super();
		this.id = id;
		this.title = title;
		this.categoryId = categoryId;
		this.shortDescription = shortDescription;
		this.description = description;
		this.imageUrl = imageUrl;
		this.activeStatus = activeStatus;
	}

	
	public BlogDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
