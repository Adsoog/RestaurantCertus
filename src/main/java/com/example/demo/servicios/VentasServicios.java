package com.example.demo.servicios;
import java.util.ArrayList;
import java.util.List;


import com.example.demo.modelo.Ventas;


import com.example.demo.repositorios.VentasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VentasServicios {
    @Autowired
    public VentasRepositorio repositorio;


    public Ventas crear(Ventas funciones) {
        return repositorio.save(funciones);
        // return repositorio.save(funciones);
    }

    public List<Ventas> buscarTodo(){
        return (ArrayList<Ventas>) repositorio.findAll();
    }

    public Ventas buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public Ventas actualizar(Ventas funcionesActualizar) {

        Ventas funcionActual = repositorio.findById(funcionesActualizar.getIdVenta()).get();

        funcionActual.setIdVenta(funcionesActualizar.getIdVenta());
        funcionActual.setCantidad(funcionesActualizar.getCantidad());
        funcionActual.setIdPlato(funcionesActualizar.getIdPlato());
        funcionActual.setDescuento(funcionesActualizar.getDescuento());
        funcionActual.setDiscapacidad(funcionesActualizar.getDiscapacidad());
        funcionActual.setFecha(funcionesActualizar.getFecha());
        funcionActual.setIva(funcionesActualizar.getIva());
        funcionActual.setSubtotal(funcionesActualizar.getSubtotal());
        funcionActual.setTotal(funcionesActualizar.getTotal());
        funcionActual.setTipoPago(funcionesActualizar.getTipoPago());
        funcionActual.setCedUsuario(funcionesActualizar.getCedUsuario());
        funcionActual.setCedCliente(funcionesActualizar.getCedCliente());
        funcionActual.setMayorEdad(funcionesActualizar.getMayorEdad());



        Ventas funcionesActualizado = repositorio.save(funcionActual);
        return funcionesActualizado;
    }

    public void eliminarClientes(Integer id) {
        repositorio.deleteById(id);
    }

    public void actualizar(int id, Ventas funcion) {

        Ventas funcionActual = repositorio.findById(id).get();

        funcionActual.setIdVenta(funcion.getIdVenta());
        funcionActual.setIdPlato(funcion.getIdPlato());
        funcionActual.setCantidad(funcion.getCantidad());
        funcionActual.setDescuento(funcion.getDescuento());
        funcionActual.setDiscapacidad(funcion.getDiscapacidad());
        funcionActual.setFecha(funcion.getFecha());
        funcionActual.setIva(funcion.getIva());
        funcionActual.setSubtotal(funcion.getSubtotal());
        funcionActual.setTotal(funcion.getTotal());
        funcionActual.setTipoPago(funcion.getTipoPago());
        funcionActual.setCedUsuario(funcion.getCedUsuario());
        funcionActual.setCedCliente(funcion.getCedCliente());
        funcionActual.setMayorEdad(funcion.getMayorEdad());
        //nuevo
        //funcionActual.setMayorEdad(funcion);

        repositorio.save(funcionActual);

    }
}
