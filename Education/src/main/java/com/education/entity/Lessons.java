package com.education.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lessons", schema = "public")
public class Lessons {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "videoUrl")
	private String videoUrl;

	@Column(name = "isPreview")
	private Boolean isPreview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="courseId", referencedColumnName = "id")
	private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="moduleId", referencedColumnName = "id")
	private Modules module;

    
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Boolean getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(Boolean isPreview) {
		this.isPreview = isPreview;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Modules getModule() {
		return module;
	}

	public void setModule(Modules module) {
		this.module = module;
	}

	
	@Override
	public String toString() {
		return "Lessons [id=" + id + ", title=" + title + ", duration=" + duration + ", videoUrl=" + videoUrl
				+ ", isPreview=" + isPreview + ", course=" + course + ", module=" + module + "]";
	}

	
	public Lessons(Long id, String title, String duration, String videoUrl, Boolean isPreview, Course course,
			Modules module) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.videoUrl = videoUrl;
		this.isPreview = isPreview;
		this.course = course;
		this.module = module;
	}

	
	public Lessons() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
