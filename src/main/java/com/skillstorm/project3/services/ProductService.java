package com.skillstorm.project3.services;

import com.skillstorm.project3.models.Product;

public interface ProductService {
	
	Iterable<Product> findAll();
	Product findById(int id);
	Product save(Product product);
	Product update(Product product);
	void delete(Product product);

}
