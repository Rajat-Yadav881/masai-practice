package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;

import jakarta.annotation.PostConstruct;

@RestController
public class BookController {
	private List<Book> books = new ArrayList<>();
	
	@PostConstruct
	public void setBooks() {
		books.add(new Book(1,"gfhgh","kama",3400));
		books.add(new Book(2,"urhguh","rajat",7899));
		books.add(new Book(3,"gfhgh","mohit",3456));
		books.add(new Book(4,"dhcbdu","naresh",7895));
		
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return books;
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") Integer id) {
		Book b = null;
		for(Book book : books) {
			if(book.getBook_id()==id) {
				b = book;
			}
			
		}
		if(b!=null) {
			return b;
		}else {
			throw new IllegalArgumentException("student does not exist with id :"+id);
		}
	}
	
	@PostMapping("/books")
	public Book registerBook(@RequestBody Book book) {
		books.add(book);
		return book;
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBookById(@PathVariable("id") Integer id) {
		boolean flag = false;
		
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getBook_id() == id) {
				books.remove(i);
				flag = true;
				break;
			}
		}
		if(flag) {
			return "book deleted Successfully...";
		}else {
			throw new IllegalArgumentException("Book does not exist with id :"+id);
		}
	}
	
	public Book updateBook(@RequestBody Book book,@PathVariable("id") Integer id) {
		boolean flag = true;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getBook_id()==id) {
				Book book2 = books.get(i);
				book2.setBook_id(book.getBook_id());
				book2.setName(book.getName());
				book2.setAuthor(book.getAuthor());
				book2.setPrice(book.getPrice());
				flag = false;
				return book2;
			}
		}
		if(flag) {
			throw new IllegalArgumentException("book does not exist with book id :"+id);
			
		}else {
			return null;
		}
	}
	
}
