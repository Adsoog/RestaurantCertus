package com.example.demo.repositorios;

import com.example.demo.modelo.Pedido;

import org.springframework.data.repository.CrudRepository;

public interface PedidosRepositorio extends CrudRepository<Pedido, Integer> {
}
