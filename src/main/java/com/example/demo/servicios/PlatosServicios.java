package com.example.demo.servicios;
import java.util.ArrayList;
import java.util.List;


import com.example.demo.modelo.Platos;
import com.example.demo.repositorios.PlatosRepositorio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlatosServicios {
    @Autowired
    public PlatosRepositorio repositorio;


    public Platos crear(Platos funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Platos> buscarTodo(){
        return (ArrayList<Platos>) repositorio.findAll();
    }

    public Platos buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Platos actualizar(Platos funcionesActualizar) {

        Platos funcionActual = repositorio.findById(funcionesActualizar.getIdPlato()).get();

        funcionActual.setIdPlato(funcionesActualizar.getIdPlato());
        funcionActual.setNombrePlato(funcionesActualizar.getNombrePlato());
        funcionActual.setPrecioPlato(funcionesActualizar.getPrecioPlato());
        funcionActual.setTipoPlato(funcionesActualizar.getTipoPlato());



        Platos funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Platos funcion) {

        Platos funcionActual = repositorio.findById(id).get();

        funcionActual.setIdPlato(funcion.getIdPlato());
        funcionActual.setNombrePlato(funcion.getNombrePlato());
        funcionActual.setPrecioPlato(funcion.getPrecioPlato());
        funcionActual.setTipoPlato(funcion.getTipoPlato());

        repositorio.save(funcionActual);

    }
    public void borrarPorId(Integer id) {
        repositorio.deleteById(id);

    }
}
