package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Aircraft;
import com.skillstorm.project3.repositories.AircraftRepository;
@Service
public class AircraftServiceImpl implements AircraftService{
	
	@Autowired
	private AircraftRepository repository;

	@Override
	public Iterable<Aircraft> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Aircraft findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aircraft save(Aircraft aircraft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aircraft update(Aircraft aircraft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Aircraft aircraft) {
		// TODO Auto-generated method stub
		
	}

	public AircraftRepository getRepository() {
		return repository;
	}

	public void setRepository(AircraftRepository repository) {
		this.repository = repository;
	}

}
