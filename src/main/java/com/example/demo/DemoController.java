package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private BookRepository repository;

	@GetMapping(value = "/api/books")
	public List<Book> getBooks () {
		return repository.findAll();
	}
}
