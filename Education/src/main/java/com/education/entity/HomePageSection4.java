package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HomePageSection4", schema = "public")
public class HomePageSection4 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "subHeader", nullable = false, length = 128)
	private String subHeader;

	@Column(name = "header", nullable = false, length = 128)
	private String header;

	@Column(name = "shortDescription", nullable = false)
	private String shortDescription;

	@Column(name = "displayOrder", nullable = false)
	private Integer displayOrder;
	
	@Column(name = "title1", nullable = false, length = 128)
	private String title1;
	
	@Column(name = "title1Description", nullable = false)
	private String title1Description;
	
	@Column(name = "title2", nullable = false, length = 128)
	private String title2;
	
	@Column(name = "title2Description", nullable = false)
	private String title2Description;
	
	@Column(name = "title3", nullable = false, length = 128)
	private String title3;
	
	@Column(name = "title3Description", nullable = false)
	private String title3Description;
	
	@Column(name = "title4", nullable = false, length = 128)
	private String title4;
	
	@Column(name = "title4Description", nullable = false)
	private String title4Description;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubHeader() {
		return subHeader;
	}

	public void setSubHeader(String subHeader) {
		this.subHeader = subHeader;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public String getTitle1Description() {
		return title1Description;
	}

	public void setTitle1Description(String title1Description) {
		this.title1Description = title1Description;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public String getTitle2Description() {
		return title2Description;
	}

	public void setTitle2Description(String title2Description) {
		this.title2Description = title2Description;
	}

	public String getTitle3() {
		return title3;
	}

	public void setTitle3(String title3) {
		this.title3 = title3;
	}

	public String getTitle3Description() {
		return title3Description;
	}

	public void setTitle3Description(String title3Description) {
		this.title3Description = title3Description;
	}

	public String getTitle4() {
		return title4;
	}

	public void setTitle4(String title4) {
		this.title4 = title4;
	}

	public String getTitle4Description() {
		return title4Description;
	}

	public void setTitle4Description(String title4Description) {
		this.title4Description = title4Description;
	}

	
	@Override
	public String toString() {
		return "HomePageSection4 [id=" + id + ", subHeader=" + subHeader + ", header=" + header + ", shortDescription="
				+ shortDescription + ", displayOrder=" + displayOrder + ", title1=" + title1 + ", title1Description="
				+ title1Description + ", title2=" + title2 + ", title2Description=" + title2Description + ", title3="
				+ title3 + ", title3Description=" + title3Description + ", title4=" + title4 + ", title4Description="
				+ title4Description + "]";
	}

	
	public HomePageSection4(Long id, String subHeader, String header, String shortDescription, Integer displayOrder,
			String title1, String title1Description, String title2, String title2Description, String title3,
			String title3Description, String title4, String title4Description) {
		super();
		this.id = id;
		this.subHeader = subHeader;
		this.header = header;
		this.shortDescription = shortDescription;
		this.displayOrder = displayOrder;
		this.title1 = title1;
		this.title1Description = title1Description;
		this.title2 = title2;
		this.title2Description = title2Description;
		this.title3 = title3;
		this.title3Description = title3Description;
		this.title4 = title4;
		this.title4Description = title4Description;
	}

	
	public HomePageSection4() {
		super();
		// TODO Auto-generated constructor stub
	}

}
