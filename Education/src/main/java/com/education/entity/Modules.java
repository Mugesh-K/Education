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
@Table(name = "Modules", schema = "public")
public class Modules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/**SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)**/
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, length = 128)
	private String title;
	
	@Column(name = "duration")
	private String duration;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="courseId", referencedColumnName = "id")
	private Course course;

    
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	@Override
	public String toString() {
		return "Modules [id=" + id + ", title=" + title + ", duration=" + duration + ", course=" + course + "]";
	}

	
	public Modules(Long id, String title, String duration, Course course) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.course = course;
	}

	
	public Modules() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
