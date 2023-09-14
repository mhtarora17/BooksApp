package com.spring.assignment.controller;

import com.spring.assignment.dto.BookDataObject;
import com.spring.assignment.exception.ResourceNotFoundException;
import com.spring.assignment.service.IBookService;
import com.spring.assignment.service.IInventoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Books controller.
 *
 * @author Mohit Arora
 */
@RestController
@RequestMapping("/api/")
public class BooksInventoryRestController {

	@Autowired
	@Qualifier(value = "inventoryService")
	private IInventoryService iInventoryService;


}
