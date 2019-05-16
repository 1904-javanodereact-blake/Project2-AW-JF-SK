package com.geekzilla.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mesId;
	@Column(nullable=false, unique=false)
	private int author;
	@Column(nullable=false, unique=false)
	private String subject;
	@Column(nullable=false, unique=false)
	private String content;
	@Column(nullable=false, unique=false)
	private Date sent_on;
	public Messages() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Messages(int id, int author, String subject, String content, Date sent_on) {
		super();
		this.mesId = id;
		this.author = author;
		this.subject = subject;
		this.content = content;
		this.sent_on = sent_on;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + author;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + mesId;
		result = prime * result + ((sent_on == null) ? 0 : sent_on.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Messages other = (Messages) obj;
		if (author != other.author)
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (mesId != other.mesId)
			return false;
		if (sent_on == null) {
			if (other.sent_on != null)
				return false;
		} else if (!sent_on.equals(other.sent_on))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	public int getId() {
		return mesId;
	}
	public void setId(int mes_id) {
		this.mesId = mes_id;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSent_on() {
		return sent_on;
	}
	public void setSent_on(Date sent_on) {
		this.sent_on = sent_on;
	}
	@Override
	public String toString() {
		return "Messages [id=" + mesId + ", author=" + author + ", subject=" + subject + ", content=" + content
				+ ", sent_on=" + sent_on + "]";
	}
	
	
}
