package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.services.ProductService;

@Controller
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping
//	@RequestMapping(value="/Product", method = RequestMethod.GET)
	public @ResponseBody Iterable<Product> findAll() {
		System.out.println("inside findall");
		
		return service.findAll();
	}
	@PutMapping
//	@RequestMapping(value="/Product", method = RequestMethod.PUT)
	public @ResponseBody Product update(Product product) {
	System.out.println("inside update");
	return service.update(product);
	}
	@PostMapping
//	@RequestMapping(value="/Product", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Product save(Product product) {
	System.out.println("inside save");
	return service.save(product);
	}
	@DeleteMapping
//	@RequestMapping(value="/Product", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody void delete(Product product) {
	System.out.println("inside deleteById");
	service.delete(product);
	}
	@GetMapping("/{id}")
	public @ResponseBody Product findById(@PathVariable int id) {
		System.out.println("inside findById");
		return service.findById(id);
	}
}
