package com.skillstorm.project3.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.WhareHouse;

@Repository
public interface WhareHouseRepository extends CrudRepository <WhareHouse, Integer>{

}
