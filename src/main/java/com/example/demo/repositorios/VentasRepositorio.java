package com.example.demo.repositorios;


import com.example.demo.modelo.Ventas;
import org.springframework.data.repository.CrudRepository;

public interface VentasRepositorio extends CrudRepository<Ventas, Integer> {
}
