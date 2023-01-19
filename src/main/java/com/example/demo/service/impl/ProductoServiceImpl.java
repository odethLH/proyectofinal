package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDao;
import com.example.demo.entity.Producto;
import com.example.demo.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {
	@Autowired
	public IProductoDao productodao;
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productodao.findAll();
	}

}
