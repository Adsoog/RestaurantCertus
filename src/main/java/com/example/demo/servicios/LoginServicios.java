package com.example.demo.servicios;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Login;
import com.example.demo.repositorios.LoginRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServicios {
    @Autowired
    public LoginRepositorio repositorio;


    public Login crear(Login funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Login> buscarTodo(){
        return (ArrayList<Login>) repositorio.findAll();
    }

    public Login buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Login actualizar(Login funcionesActualizar) {

        Login funcionActual = repositorio.findById(funcionesActualizar.getCedula()).get();

        funcionActual.setCedula (funcionesActualizar.getCedula());
        funcionActual.setApellidos(funcionesActualizar.getApellidos());
        funcionActual.setNombres(funcionesActualizar.getNombres());
        funcionActual.setTelefono(funcionesActualizar.getTelefono());
        funcionActual.setDireccion (funcionesActualizar.getDireccion());

        funcionActual.setPassword(funcionesActualizar.getPassword());
        funcionActual.setGenero(funcionesActualizar.getGenero());


        Login funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Login funcion) {

        Login funcionActual = repositorio.findById(id).get();

        funcionActual.setCedula(funcion.getCedula());
        funcionActual.setNombres(funcion.getNombres());
        funcionActual.setApellidos(funcion.getApellidos());
        funcionActual.setDireccion(funcion.getDireccion());
        funcionActual.setGenero(funcion.getGenero());

        funcionActual.setPassword(funcion.getPassword());
        funcionActual.setTelefono(funcion.getTelefono());
        repositorio.save(funcionActual);

    }
}
