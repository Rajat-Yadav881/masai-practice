package com.cors.controller;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Service;

public class Book {
	
	private int Book_Id;
	private String name;
	private String author;
	private String publication;
	private String category;
	private int pages;
	private int price;
	private int author_no;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int book_Id, String name, String author, String publication, String category, int pages, int price,
			int author_no) {
		super();
		Book_Id = book_Id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.author_no = author_no;
	}
	public int getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(int book_Id) {
		Book_Id = book_Id;
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
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAuthor_no() {
		return author_no;
	}
	public void setAuthor_no(int author_no) {
		this.author_no = author_no;
	}
	@Override
	public String toString() {
		return "Book [Book_Id=" + Book_Id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", author_no=" + author_no + "]";
	}
	
	
}
