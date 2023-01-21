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

//Rename to whatever after service established
import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.services.InventoryService;

@Controller
@RequestMapping("/Inventory")
public class InventoryController {

	@Autowired
	private InventoryService service;
	
	@GetMapping
//	@RequestMapping(value="/Inventory", method = RequestMethod.GET)
	public @ResponseBody Iterable<Inventory> findAll() {
		System.out.println("inside findall");
		
		return service.findAll();
	}
	@PutMapping
//	@RequestMapping(value="/Inventory", method = RequestMethod.PUT)
	public @ResponseBody Inventory update(Inventory inventory) {
	System.out.println("inside update");
	return service.update(inventory);
	}
	@PostMapping
//	@RequestMapping(value="/Inventory", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Inventory save(Inventory inventory) {
	System.out.println("inside save");
	return service.save(inventory);
	}
	@DeleteMapping
//	@RequestMapping(value="/Inventory", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody void delete(Inventory inventory) {
	System.out.println("inside deleteById");
	service.delete(inventory);
	}
	@GetMapping("/{id}")
	public @ResponseBody Inventory findById(@PathVariable int id) {
		System.out.println("finding by Id");
		return service.findById(id);
	}
	
	
	
}
