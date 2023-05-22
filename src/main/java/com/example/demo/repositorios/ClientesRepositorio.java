package com.example.demo.repositorios;

import com.example.demo.modelo.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClientesRepositorio extends CrudRepository<Clientes, Integer> {

}
