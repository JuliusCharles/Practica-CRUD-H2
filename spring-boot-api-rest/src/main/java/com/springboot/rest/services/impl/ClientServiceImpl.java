package com.springboot.rest.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.rest.models.dao.ClientDAO;
import com.springboot.rest.models.entity.Client;
import com.springboot.rest.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Client> findAll() {		
		return (List<Client>) clientDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Client> findAll(Pageable pageable) {
		return clientDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Client findById(Long id) {
		return clientDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Client save(Client client) {
		return clientDao.save(client);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clientDao.deleteById(id);
	}


}
