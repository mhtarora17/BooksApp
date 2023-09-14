package com.spring.assignment.service;

import com.spring.assignment.dto.BookDataObject;
import com.spring.assignment.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inventoryService")
public interface IInventoryService {
	
	public List<BookDataObject> getAllBooks();
	
	public BookDataObject getBookById(Long bookId) throws ResourceNotFoundException;
	
	public BookDataObject createBook(BookDataObject book);
	
	public BookDataObject updateBooks(Long bookId,BookDataObject bookDataObject) throws ResourceNotFoundException;
	
	public Boolean deleteBooks(Long bookId) throws Exception;
}
