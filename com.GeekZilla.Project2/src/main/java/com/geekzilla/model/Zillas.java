package com.geekzilla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Zillas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	
	@OneToOne
	@JoinColumn(unique = true)
	private Users userId;
	
	@Column(nullable=false, unique=false)
	private int likeCount;

	public Zillas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zillas(int postId, Users userId, int likeCount) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.likeCount = likeCount;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "Zillas [postId=" + postId + ", userId=" + userId + ", likeCount=" + likeCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + likeCount;
		result = prime * result + postId;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
}

