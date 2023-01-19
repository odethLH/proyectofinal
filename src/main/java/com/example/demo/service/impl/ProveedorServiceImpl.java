package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Proveedor;
import com.example.demo.repository.IProveedorRepository;
import com.example.demo.service.IProveedorService;

import jakarta.transaction.Transactional;

@Service
public class ProveedorServiceImpl implements IProveedorService {
	@Autowired
	private IProveedorRepository repository;

	@Override
	public List<Proveedor> listarTodos() {
	List<Proveedor> lista = (List<Proveedor>) repository.findAll();
	return lista;
	}

	@Transactional(rollbackOn = Exception.class)
	@Override
	public void grabar(Proveedor proveedor) {
	repository.save(proveedor);
	}

	@Override
	public Proveedor buscarPorId(long id) {
	Proveedor bean = repository.findById(id).orElse(null);
	return bean;
	}

	@Override
	public void eliminar(Long id) {
	repository.deleteById(id);
	}
}
