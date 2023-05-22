package com.example.demo.servicios;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Clientes;
import com.example.demo.repositorios.ClientesRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientesServicios {
    @Autowired
    public ClientesRepositorio repositorio;


    public Clientes crear(Clientes funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Clientes> buscarTodo(){
        return (ArrayList<Clientes>) repositorio.findAll();
    }

    public Clientes buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Clientes actualizar(Clientes funcionesActualizar) {

        Clientes funcionActual = repositorio.findById(funcionesActualizar.getCedula()).get();

        funcionActual.setCedula (funcionesActualizar.getCedula());
        funcionActual.setApellidos(funcionesActualizar.getApellidos());
        funcionActual.setNombres(funcionesActualizar.getNombres());
        funcionActual.setTelefono(funcionesActualizar.getTelefono());
        funcionActual.setDireccion (funcionesActualizar.getDireccion());
        funcionActual.setFechNacimiento(funcionesActualizar.getFechNacimiento());
        funcionActual.setGenero(funcionesActualizar.getGenero());


        Clientes funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Clientes funcion) {

        Clientes funcionActual = repositorio.findById(id).get();

        funcionActual.setCedula(funcion.getCedula());
        funcionActual.setNombres(funcion.getNombres());
        funcionActual.setApellidos(funcion.getApellidos());
        funcionActual.setDireccion(funcion.getDireccion());
        funcionActual.setGenero(funcion.getGenero());
        funcionActual.setFechNacimiento(funcion.getFechNacimiento());
        funcionActual.setTelefono(funcion.getTelefono());
        repositorio.save(funcionActual);

    }

}
