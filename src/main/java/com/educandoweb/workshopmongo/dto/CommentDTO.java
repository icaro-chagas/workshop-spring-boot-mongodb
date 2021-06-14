package com.educandoweb.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date dade;
	private AuthorDTO author;
	
	public CommentDTO() {
	}

	public CommentDTO(String text, Date dade, AuthorDTO author) {
		this.text = text;
		this.dade = dade;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDade() {
		return dade;
	}

	public void setDade(Date dade) {
		this.dade = dade;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
}
