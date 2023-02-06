package com.example.accessingdatamysql.service.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.service.repo.entity.RegisterEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface RegisterRepository extends CrudRepository<RegisterEntity, Integer> { 
    
}