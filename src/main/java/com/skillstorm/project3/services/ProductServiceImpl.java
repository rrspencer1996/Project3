package com.skillstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository repository;
	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product> product = repository.findById(id);
		return product.isPresent() ? product.get() : null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	
}
