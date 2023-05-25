package com.example.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.MenuFoto;
import com.example.demo.repositorios.MenuRepositorio;

import java.util.List;

@Service
public class MenuServicioImpl implements MenuServicio{
    @Autowired
    private MenuRepositorio menuRepositorio;

    @Override
    public MenuFoto create(MenuFoto menufoto) {
        return menuRepositorio.save(menufoto);
    }

    @Override
    public List<MenuFoto> viewAll() {
        return (List<MenuFoto>) menuRepositorio.findAll();
    }

    @Override
    public MenuFoto viewById(long id) {
        return menuRepositorio.findById(id).get();
    }
}
