package com.geekzilla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Zillas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	@OneToOne(fetch = FetchType.LAZY)
	@Column(name = "user_id", nullable=false, unique=true)
	private int userId;
	@Column(nullable=false, unique=false)
	private int likeCount;
	public Zillas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zillas(int post_id, int user_id, int like_count) {
		super();
		this.postId = post_id;
		this.userId = user_id;
		this.likeCount = like_count;
	}
	@Override
	public String toString() {
		return "Zillas [post_id=" + postId + ", user_id=" + userId + ", like_count=" + likeCount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + likeCount;
		result = prime * result + postId;
		result = prime * result + userId;
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
		Zillas other = (Zillas) obj;
		if (likeCount != other.likeCount)
			return false;
		if (postId != other.postId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	public int getPost_id() {
		return postId;
	}
	public void setPost_id(int post_id) {
		this.postId = post_id;
	}
	public int getUser_id() {
		return userId;
	}
	public void setUser_id(int user_id) {
		this.userId = user_id;
	}
	public int getLike_count() {
		return likeCount;
	}
	public void setLike_count(int like_count) {
		this.likeCount = like_count;
	}


}

