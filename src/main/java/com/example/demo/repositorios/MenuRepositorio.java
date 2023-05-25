package com.example.demo.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.MenuFoto;

@Repository
public interface MenuRepositorio extends CrudRepository<MenuFoto, Long> {

}
