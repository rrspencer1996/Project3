package com.skillstorm.project3.services;

import com.skillstorm.project3.models.WhareHouse;

public interface WhareHouseService {

	Iterable<WhareHouse> findAll();
	WhareHouse findById(int id);
	WhareHouse save(WhareHouse wharehouse);
	WhareHouse update(WhareHouse wharehouse);
	void delete(WhareHouse wharehouse);
}
	

