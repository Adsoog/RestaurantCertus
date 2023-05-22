package com.example.demo.servicios;
import java.util.ArrayList;
import java.util.List;


import com.example.demo.modelo.Pedido;
import com.example.demo.repositorios.PedidosRepositorio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PedidosServicios {
    @Autowired
    public PedidosRepositorio repositorio;


    public Pedido crear(Pedido funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Pedido> buscarTodo(){
        return (ArrayList<Pedido>) repositorio.findAll();
    }

    public Pedido buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Pedido actualizar(Pedido funcionesActualizar) {

        Pedido funcionActual = repositorio.findById(funcionesActualizar.getIdPedido()).get();

        funcionActual.setIdPedido(funcionesActualizar.getIdPedido());
        funcionActual.setDelivery(funcionesActualizar.getDelivery());
        funcionActual.setCosto(funcionesActualizar.getCosto());
        funcionActual.setPlato(funcionesActualizar.getPlato());



        Pedido funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Pedido funcion) {

        Pedido funcionActual = repositorio.findById(id).get();

        funcionActual.setIdPedido(funcion.getIdPedido());
        funcionActual.setDelivery(funcion.getDelivery());
        funcionActual.setCosto(funcion.getCosto());
        funcionActual.setPlato(funcion.getPlato());

        repositorio.save(funcionActual);

    }
}
