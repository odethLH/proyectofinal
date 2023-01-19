package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IClienteDao;
import com.example.demo.entity.Cliente;
import com.example.demo.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	public IClienteDao clientedao;
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clientedao.findAll();
	}

}
