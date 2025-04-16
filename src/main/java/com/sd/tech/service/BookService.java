package com.sd.tech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sd.tech.entity.Book;

@Service
public class BookService {
	
	public List<Book> books=new ArrayList<>();
	
	public Book saveBook(Book book)
	{
		 books.add(book);
		 return books.get(0);
	}
	
	public Book getBook(int id)
	{
		
		 return books.get(id-1);
	}
	
	
	public List<Book> getAllBooks()
	{
		 return books;
	}
	
	

}
