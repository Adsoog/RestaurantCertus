package com.example.demo.servicios;
import java.util.ArrayList;
import java.util.List;


import com.example.demo.modelo.Delivery;
import com.example.demo.repositorios.DeliveryRepositorio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeliveryServicios {
    @Autowired
    public DeliveryRepositorio repositorio;


    public Delivery crear(Delivery funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Delivery> buscarTodo(){
        return (ArrayList<Delivery>) repositorio.findAll();
    }

    public Delivery buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Delivery actualizar(Delivery funcionesActualizar) {

        Delivery funcionActual = repositorio.findById(funcionesActualizar.getIdDelivery()).get();

        funcionActual.setIdDelivery(funcionesActualizar.getIdDelivery());
        funcionActual.setNombre(funcionesActualizar.getNombre());
        funcionActual.setPlato(funcionesActualizar.getPlato());
        funcionActual.setLugar(funcionesActualizar.getLugar());



        Delivery funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Delivery funcion) {

        Delivery funcionActual = repositorio.findById(id).get();

        funcionActual.setIdDelivery(funcion.getIdDelivery());
        funcionActual.setNombre(funcion.getNombre());
        funcionActual.setPlato(funcion.getPlato());
        funcionActual.setLugar(funcion.getLugar());

        repositorio.save(funcionActual);

    }
    public void borrarPorId(Integer id) {
        repositorio.deleteById(id);

    }
    
}
