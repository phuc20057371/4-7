package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Khoahoc;
import com.example.demo.repository.KhoahocRepository;
import com.example.demo.service.KhoahocService;

@Service
public class KhoahocServiceImpl implements KhoahocService{
	private KhoahocRepository repository;
	
	public KhoahocServiceImpl(KhoahocRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public Khoahoc createKhoahoc(Khoahoc kh) {
		// TODO Auto-generated method stub
		return repository.save(kh);
	}
	
}
