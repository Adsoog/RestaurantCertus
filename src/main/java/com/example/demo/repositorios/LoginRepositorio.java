package com.example.demo.repositorios;


import com.example.demo.modelo.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepositorio extends CrudRepository<Login, Integer> {
}
