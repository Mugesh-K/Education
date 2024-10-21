package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HomePageSection1", schema = "public")
public class HomePageSection1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;

	@Column(name = "subTitle", nullable = false, length = 128)
	private String subTitle;
	
	@Column(name = "shortDescription", nullable = false)
	private String shortDescription;

	@Column(name = "imageUrl")
	private String imageUrl;

	@Column(name = "displayOrder", nullable = false)
	private Integer displayOrder;

	
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

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	
	@Override
	public String toString() {
		return "HomePageSection1 [id=" + id + ", title=" + title + ", subTitle=" + subTitle + ", shortDescription="
				+ shortDescription + ", imageUrl=" + imageUrl + ", displayOrder=" + displayOrder + "]";
	}

	
	public HomePageSection1(Long id, String title, String subTitle, String shortDescription, String imageUrl,
			Integer displayOrder) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.shortDescription = shortDescription;
		this.imageUrl = imageUrl;
		this.displayOrder = displayOrder;
	}

	
	public HomePageSection1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
