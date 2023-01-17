package com.skillstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.repositories.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{
	@Autowired
	private InventoryRepository repository;
	@Override
	public Iterable<Inventory> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Inventory findById(int id) {
		Optional<Inventory> inventory = repository.findById(id);
		return inventory.isPresent() ? inventory.get() : null;
	}

	@Override
	public Inventory save(Inventory inventory) {
		// TODO Auto-generated method stub
		return repository.save(inventory);
	}

	@Override
	public Inventory update(Inventory inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Inventory inventory) {
		// TODO Auto-generated method stub
		
	}
}
