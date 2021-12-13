package com.SpringBoot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoot.app.entity.Tiquete;
import com.SpringBoot.app.repository.TiqueteRepository;

@Service
public class TiqueteServiceImpl implements TiqueteService {

	@Autowired
	private TiqueteRepository tiqueteRepository;
	
	@Override
	@Transactional
	public Tiquete guardarTiquete(Tiquete tiquete) {
		return tiqueteRepository.save(tiquete);
	}

}
