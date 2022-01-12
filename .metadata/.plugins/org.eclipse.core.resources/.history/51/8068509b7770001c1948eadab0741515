package com.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class BookController {
	
@GetMapping("/add")

public  List<Book> AddBooks(){
	ArrayList<Book> books=new ArrayList<>();
	books.add(new Book(1, "maths", 100));
	books.add(new Book(2, "science", 200));
	books.add(new Book(3, "data science",150));
	
	return books;
	



}

@RequestMapping("/get/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	

	
}
