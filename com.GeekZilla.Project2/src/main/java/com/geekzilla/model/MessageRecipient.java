package com.geekzilla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class MessageRecipient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(nullable=false, unique=true)
	private int message;
	
	@Column(nullable=false, unique=true)
	private boolean isread;
	
	public MessageRecipient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageRecipient(int id, int message, boolean isread) {
		super();
		this.id = id;
		this.message = message;
		this.isread = isread;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public boolean isIsread() {
		return isread;
	}

	public void setIsread(boolean isread) {
		this.isread = isread;
	}

	@Override
	public String toString() {
		return "MessageRecipient [id=" + id + ", message=" + message + ", isread=" + isread + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (isread ? 1231 : 1237);
		result = prime * result + message;
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
		MessageRecipient other = (MessageRecipient) obj;
		if (id != other.id)
			return false;
		if (isread != other.isread)
			return false;
		if(message != other.message)
			return false;
		return true;
	}
		
}