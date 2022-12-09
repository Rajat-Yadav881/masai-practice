package com.cors.controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/bookService")
public class MyController {
	
	@GetMapping(value = "/books")
	
	private List<Book> getAllBooks(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(101,"c++","Nitesh","Rajput publication","Computer Programming",1500,240,450));
		books.add(new Book(102,"pyton","rajat","dayal publication","Computer Programming",1456,686,456));
		books.add(new Book(103,"java","nrupul","Rajput publication","Computer Programming",1300,453,555));
		books.add(new Book(104,"javascript","yogesh","kartik publication","Computer Programming",2354,234,345));
		books.add(new Book(105,"kotlin","ratan","ahmed publication","Computer Programming",6754,545,234));
		return books;
		
	}
	@GetMapping(value = "/books/{r}")
	private Book getBookById(@PathVariable("r") int book_Id) {
		Book book = new Book(book_Id,"react","lowrence","low publication","cevil computing",4500,230,123);
		
		return book;
		
	}
	@PostMapping(value = "/books")
	private String newBook(@RequestBody Book book) {
		
		return "registered successfully";
	}
	@DeleteMapping(value = "/books/{id}")
	private String deleteBookById(@PathVariable("id") int book_Id) {
		
		return "deleted";
	}
	
	@PutMapping(value = "/books/{price}")
	public Book updateStudentDetails(@RequestBody Book book,@PathVariable("price")int price) {
		int sprice = 500;
		book.setPrice(book.getPrice()+sprice);
		return book;
	}

		
	
}
