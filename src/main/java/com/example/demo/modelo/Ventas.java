package com.example.demo.modelo;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Librerias utilizando Lombok
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name ="ventas")
@NamedQueries({
        @NamedQuery(name="Ventas.findAll", query ="SELECT f FROM Ventas f")
        ,@NamedQuery(name ="Ventas.findByIdVenta", query = "SELECT f FROM Ventas f WHERE f.idVenta = :idVenta")
        //,@NamedQuery(name ="Ventas.findIdPlato", query = "SELECT f FROM Ventas f WHERE f.idPlato= :idPlato")
        ,@NamedQuery(name ="Ventas.findCedCliente", query = "SELECT f FROM Ventas f WHERE f.cedCliente= :cedCliente")

        ,@NamedQuery(name ="Ventas.findCedUsuario", query = "SELECT f FROM Ventas f WHERE f.cedUsuario = :cedUsuario")
        ,@NamedQuery(name = "Ventas.findDiscapacidad", query = "SELECT f FROM Ventas f WHERE f.discapacidad = : discapacidad")
        ,@NamedQuery(name = "Ventas.findMayorEdad", query = "SELECT f FROM Ventas f WHERE f.mayorEdad = : mayorEdad")
        ,@NamedQuery(name = "Ventas.findFecha ", query = "SELECT f FROM Ventas f WHERE f.fecha = : fecha")
        ,@NamedQuery(name = "Ventas.findCantidad ", query = "SELECT f FROM Ventas f WHERE f.cantidad = : cantidad")
        ,@NamedQuery(name = "Ventas.findTipoPago", query = "SELECT f FROM Ventas f WHERE f.tipoPago = : tipoPago")
        ,@NamedQuery(name = "Ventas.findDescuento", query = "SELECT f FROM Ventas f WHERE f.descuento = : descuento")
        ,@NamedQuery(name = "Ventas.findSubtotal", query = "SELECT f FROM Ventas f WHERE f.subtotal = : subtotal")
        ,@NamedQuery(name = "Ventas.findIva", query = "SELECT f FROM Ventas f WHERE f.iva = : iva")
        ,@NamedQuery(name = "Ventas.findTotal", query = "SELECT f FROM Ventas f WHERE f.total = :total")})
public class Ventas implements Serializable {
    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idVenta")
    private Integer idVenta;



    @Basic(optional = false)
    @Column(name="idPlato")
    private String idPlato;

    //NUEVO----este es nuevo
    //@JoinColumn(name="platos",referencedColumnName = "idPlato")
    //ManyToOne(optional = false)
    //@Transient
    //private Platos idPlato;





    @Basic(optional = false)
    @Column(name = "cedCliente")
    private String cedCliente;

    @Basic(optional = false)
    @Column(name = "cedUsuario")
    private String cedUsuario;

    @Basic(optional = false)
    @Column(name = "discapacidad")
    private String discapacidad;

    @Basic(optional = false)
    @Column(name = "mayorEdad")
    private String mayorEdad;

    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;

    @Basic(optional = false)
    @Column(name = "cantidad")
    private String cantidad;

    @Basic(optional = false)
    @Column(name = "tipoPago")
    private String tipoPago;

    @Basic(optional = false)
    @Column(name = "descuento")
    private String descuento;

    @Basic(optional = false)
    @Column(name = "subtotal")
    private String subtotal;

    @Basic(optional = false)
    @Column(name = "iva")
    private String iva;

    @Basic(optional = false)
    @Column(name = "total")
    private String total;

}
