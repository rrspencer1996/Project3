package com.skillstorm.project3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.WhareHouse;
import com.skillstorm.project3.repositories.WhareHouseRepository;

@Service
public class WhareHouseImplService implements WhareHouseService{

	@Autowired
	private WhareHouseRepository repository;
	@Override
	public Iterable<WhareHouse> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public WhareHouse findById(int id) {
		Optional<WhareHouse> wharehouse = repository.findById(id);
		return wharehouse.isPresent() ? wharehouse.get() : null;
	}

	@Override
	public WhareHouse save(WhareHouse wharehouse) {
		// TODO Auto-generated method stub
		return repository.save(wharehouse);
	}

	@Override
	public WhareHouse update(WhareHouse wharehouse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(WhareHouse wharehouse) {
		// TODO Auto-generated method stub
		
	}

}
