package com.example.demo.repositorios;


import com.example.demo.modelo.Platos;
import org.springframework.data.repository.CrudRepository;

public interface PlatosRepositorio extends CrudRepository<Platos, Integer> {
}
