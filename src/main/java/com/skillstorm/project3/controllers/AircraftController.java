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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.skillstorm.project3.models.Aircraft;
import com.skillstorm.project3.services.AircraftService;

@Controller
@RequestMapping("/Aircraft")
public class AircraftController {

	@Autowired
	private AircraftService service;
	
	@GetMapping
    @RequestMapping(value="/Aircraft", method = RequestMethod.GET)
	public @ResponseBody Iterable<Aircraft> findAll() {
		System.out.println("inside findall");
		
		return service.findAll();
	}
	@PutMapping
    @RequestMapping(value="/Aircraft", method = RequestMethod.PUT)
	public @ResponseBody Aircraft update(Aircraft aircraft) {
	System.out.println("inside update");
	return service.update(aircraft);
	}
	@PostMapping
    @RequestMapping(value="/Aircraft", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Aircraft save(Aircraft aircraft) {
	System.out.println("inside save");
	return service.save(aircraft);
	}
	@DeleteMapping
    @RequestMapping(value="/Aircraft", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody void delete(Aircraft aircraft) {
	System.out.println("inside deleteById");
	service.delete(aircraft);
	}
	@GetMapping("/{id}")
	public @ResponseBody Aircraft findById(@PathVariable int id) {
		System.out.println("finding by Id");
		return service.findById(id);
	}
}
