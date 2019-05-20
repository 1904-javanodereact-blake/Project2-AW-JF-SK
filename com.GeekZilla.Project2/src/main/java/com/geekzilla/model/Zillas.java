	package com.geekzilla.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Zillas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	
	@ManyToOne
	private Users user;
	
	private int likeCount;
	
	private String post;
	
	@Column(name = "sent_on", nullable=false, unique=false)
	private long sentOn;

	public Zillas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zillas(int postId, Users user, int likeCount, String post, long sentOn) {
		super();
		this.postId = postId;
		this.user = user;
		this.likeCount = likeCount;
		this.post = post;
		this.sentOn = sentOn;
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

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public long getSentOn() {
		return sentOn;
	}

	public void setSentOn(long sentOn) {
		this.sentOn = sentOn;
	}

	@Override
	public String toString() {
		return "Zillas [postId=" + postId + ", user=" + user + ", likeCount=" + likeCount + ", post=" + post
				+ ", sentOn=" + sentOn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + likeCount;
		result = prime * result + ((post == null) ? 0 : post.hashCode());
		result = prime * result + postId;
		result = prime * result + (int) (sentOn ^ (sentOn >>> 32));
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
		if (post == null) {
			if (other.post != null)
				return false;
		} else if (!post.equals(other.post))
			return false;
		if (postId != other.postId)
			return false;
		if (sentOn != other.sentOn)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
}