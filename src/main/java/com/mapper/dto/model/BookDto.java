package com.mapper.dto.model;

public class BookDto {

	private String id;
	
	private String name;
	
	private String author;
	
	private Integer pages;
	
	private String libraryID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getLibraryID() {
		return libraryID;
	}

	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}
	
}
