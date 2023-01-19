package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario,Long> {

}
