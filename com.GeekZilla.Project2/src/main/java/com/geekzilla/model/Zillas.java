package com.geekzilla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Zillas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	@ManyToOne
	@JoinColumn(name = "userId")
	private Users user;
	
	private int likeCount;
	
	

	public Zillas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zillas(int postId, Users user, int likeCount) {
		super();
		this.postId = postId;
		this.user = user;
		this.likeCount = likeCount;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "Zillas [postId=" + postId + ", user=" + user + ", likeCount=" + likeCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + likeCount;
		result = prime * result + postId;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
}

