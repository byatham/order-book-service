package com.sd.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.tech.entity.Book;
import com.sd.tech.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book)
	{
		return bookService.saveBook(book);
	}
	
	@GetMapping("/findBook/{id}")
	public Book saveBook(@PathVariable("id") int id)
	{
		return bookService.getBook(id);
	}
	
	@GetMapping("/allBooks")
	public List<Book> getAllBook()
	{
		return bookService.getAllBooks();
	}


}
