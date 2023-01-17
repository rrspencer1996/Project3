package com.skillstorm.project3.services;

import com.skillstorm.project3.models.Inventory;

public interface InventoryService {
	

	Iterable<Inventory> findAll();
	Inventory findById(int id);
	Inventory save(Inventory inventory);
	Inventory update(Inventory inventory);
	void delete(Inventory inventory);

}
