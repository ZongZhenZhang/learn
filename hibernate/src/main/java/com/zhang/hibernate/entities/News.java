package com.zhang.hibernate.entities;

import java.util.Date;

public class News {

	private Integer id;
	private String title;
	private String athour;
	private Date date;
	
	public News() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAthour() {
		return athour;
	}

	public void setAthour(String athour) {
		this.athour = athour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", athour=" + athour + ", date=" + date + "]";
	}

	public News(String title, String athour, Date date) {
		super();
		this.title = title;
		this.athour = athour;
		this.date = date;
	}

}
