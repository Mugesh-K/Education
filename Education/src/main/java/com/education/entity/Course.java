package com.education.entity;

import com.education.enums.CourseLevel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course", schema = "public")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;

	@Column(name = "shortDescription", nullable = false)
	private String shortDescription;
	
	@Lob
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "duration")
	private String duration;

	@Column(name = "isPaid")
	private Boolean isPaid;

	@Column(name = "price")
	private Integer price;
	
	@Column(name = "courseLevel")
	@Enumerated(EnumType.STRING)
	private CourseLevel courseLevel;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "thumbnailImgUrl")
	private String thumbnailImgUrl;

	
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public CourseLevel getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(CourseLevel courseLevel) {
		this.courseLevel = courseLevel;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getThumbnailImgUrl() {
		return thumbnailImgUrl;
	}

	public void setThumbnailImgUrl(String thumbnailImgUrl) {
		this.thumbnailImgUrl = thumbnailImgUrl;
	}

	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", shortDescription=" + shortDescription + ", description="
				+ description + ", duration=" + duration + ", isPaid=" + isPaid + ", price=" + price + ", courseLevel="
				+ courseLevel + ", language=" + language + ", thumbnailImgUrl=" + thumbnailImgUrl + "]";
	}

	
	public Course(Long id, String title, String shortDescription, String description, String duration, Boolean isPaid,
			Integer price, CourseLevel courseLevel, String language, String thumbnailImgUrl) {
		super();
		this.id = id;
		this.title = title;
		this.shortDescription = shortDescription;
		this.description = description;
		this.duration = duration;
		this.isPaid = isPaid;
		this.price = price;
		this.courseLevel = courseLevel;
		this.language = language;
		this.thumbnailImgUrl = thumbnailImgUrl;
	}
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
