package com.springboot.rest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.models.entity.Client;

public interface ClientDAO extends JpaRepository<Client, Long>{
	
}
