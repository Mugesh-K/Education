package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HomePageSection3", schema = "public")
public class HomePageSection3 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;

	@Column(name = "subTitle", nullable = false, length = 128)
	private String subTitle;
	
	@Column(name = "bulletPoint1", nullable = false, length = 128)
	private String bulletPoint1;
	
	@Column(name = "bulletPoint2", nullable = false, length = 128)
	private String bulletPoint2;
	
	@Column(name = "bulletPoint3", nullable = false, length = 128)
	private String bulletPoint3;
	
	@Column(name = "bulletPoint4", nullable = false, length = 128)
	private String bulletPoint4;

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

	public String getBulletPoint1() {
		return bulletPoint1;
	}

	public void setBulletPoint1(String bulletPoint1) {
		this.bulletPoint1 = bulletPoint1;
	}

	public String getBulletPoint2() {
		return bulletPoint2;
	}

	public void setBulletPoint2(String bulletPoint2) {
		this.bulletPoint2 = bulletPoint2;
	}

	public String getBulletPoint3() {
		return bulletPoint3;
	}

	public void setBulletPoint3(String bulletPoint3) {
		this.bulletPoint3 = bulletPoint3;
	}

	public String getBulletPoint4() {
		return bulletPoint4;
	}

	public void setBulletPoint4(String bulletPoint4) {
		this.bulletPoint4 = bulletPoint4;
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
		return "HomePageSection3 [id=" + id + ", title=" + title + ", subTitle=" + subTitle + ", bulletPoint1="
				+ bulletPoint1 + ", bulletPoint2=" + bulletPoint2 + ", bulletPoint3=" + bulletPoint3 + ", bulletPoint4="
				+ bulletPoint4 + ", shortDescription=" + shortDescription + ", imageUrl=" + imageUrl + ", displayOrder="
				+ displayOrder + "]";
	}
	

	public HomePageSection3(Long id, String title, String subTitle, String bulletPoint1, String bulletPoint2,
			String bulletPoint3, String bulletPoint4, String shortDescription, String imageUrl, Integer displayOrder) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.bulletPoint1 = bulletPoint1;
		this.bulletPoint2 = bulletPoint2;
		this.bulletPoint3 = bulletPoint3;
		this.bulletPoint4 = bulletPoint4;
		this.shortDescription = shortDescription;
		this.imageUrl = imageUrl;
		this.displayOrder = displayOrder;
	}

	
	public HomePageSection3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
