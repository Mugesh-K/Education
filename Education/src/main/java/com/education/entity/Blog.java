package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Blog", schema = "public")
public class Blog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoryId", referencedColumnName = "id")
	private Categories category;
	
	@Column(name = "shortDescription", nullable = false)
	private String shortDescription;
	
	@Lob
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "imageUrl")
	private String imageUrl;

	@Column(name = "activeStatus")
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

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
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
		return "Blog [id=" + id + ", title=" + title + ", category=" + category + ", shortDescription="
				+ shortDescription + ", description=" + description + ", imageUrl=" + imageUrl + ", activeStatus="
				+ activeStatus + "]";
	}

	
	public Blog(Long id, String title, Categories category, String shortDescription, String description,
			String imageUrl, Boolean activeStatus) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.shortDescription = shortDescription;
		this.description = description;
		this.imageUrl = imageUrl;
		this.activeStatus = activeStatus;
	}

	
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	} 

}
