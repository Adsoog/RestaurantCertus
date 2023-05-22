package com.example.demo.servicios;

import java.util.ArrayList;
import java.util.List;


import com.example.demo.modelo.Sede;



import com.example.demo.repositorios.SedeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SedeServicios {
    @Autowired
    public SedeRepositorio repositorio;


    public Sede crear(Sede funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Sede> buscarTodo(){
        return (ArrayList<Sede>) repositorio.findAll();
    }

    public Sede buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Sede actualizar(Sede funcionesActualizar) {

        Sede funcionActual = repositorio.findById(funcionesActualizar.getIdSede()).get();

        funcionActual.setIdSede(funcionesActualizar.getIdSede());
        funcionActual.setNombreSede(funcionesActualizar.getNombreSede());
        funcionActual.setCategoriaSede(funcionesActualizar.getCategoriaSede());
        funcionActual.setCineSede(funcionesActualizar.getCineSede());
        funcionActual.setDireccionSede(funcionesActualizar.getDireccionSede());




        Sede funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Sede funcion) {

        Sede funcionActual = repositorio.findById(id).get();

        funcionActual.setIdSede(funcion.getIdSede());
        funcionActual.setDireccionSede(funcion.getDireccionSede());
        funcionActual.setCineSede(funcion.getCineSede());
        funcionActual.setCategoriaSede(funcion.getCategoriaSede());
        funcionActual.setNombreSede(funcion.getNombreSede());


        repositorio.save(funcionActual);

    }
    public void borrarPorId(Integer id) {
        repositorio.deleteById(id);

    }
}
