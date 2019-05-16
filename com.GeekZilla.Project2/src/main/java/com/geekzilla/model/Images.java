package com.geekzilla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Images {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "img_id")
private int imgId;

@Column(nullable=false, unique=true)
private String url;

@Column(nullable = false, unique = true)
private String title;

public Images() {
	super();
	// TODO Auto-generated constructor stub
}
public Images(int img_id, String url, String title) {
	super();
	this.imgId = img_id;
	this.url = url;
	this.title = title;
}
@Override
public String toString() {
	return "Images [img_id=" + imgId + ", url=" + url + ", title=" + title + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + imgId;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((url == null) ? 0 : url.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Images other = (Images) obj;
	if (imgId != other.imgId)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;	
	} else if (!title.equals(other.title))
		return false;
	if (url == null) {
		if (other.url != null)
			
			return false;
	} else if (!url.equals(other.url))
		return false;
	return true;
}
public int getImg_id() {
	return imgId;
}
public void setImg_id(int img_id) {
	this.imgId = img_id;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}
