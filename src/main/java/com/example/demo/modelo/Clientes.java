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
@Table(name ="clientes")
@NamedQueries({
        @NamedQuery(name="Clientes.findAll", query ="SELECT f FROM Clientes f")
        ,@NamedQuery(name ="Clientes.findByIdCedula", query = "SELECT f FROM Clientes f WHERE f.cedula = :cedula")
        ,@NamedQuery(name = "Clientes.findApellidos", query = "SELECT f FROM Clientes f WHERE f.apellidos = : apellidos")
        ,@NamedQuery(name = "Clientes.findTelefono", query = "SELECT f FROM Clientes f WHERE f.telefono = : telefono")
        ,@NamedQuery(name = "Clientes.findDireccion", query = "SELECT f FROM Clientes f WHERE f.direccion = : direccion")
        ,@NamedQuery(name = "Clientes.findGenero", query = "SELECT f FROM Clientes f WHERE f.genero = : genero")
        ,@NamedQuery(name = "Clientes.findFechNacimiento", query = "SELECT f FROM Clientes f WHERE f.fechNacimiento = : fechNacimiento")
        ,@NamedQuery(name = "Clientes.findNombres", query = "SELECT f FROM Clientes f WHERE f.nombres = :nombres")})
public class Clientes implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="cedula")
    private Integer cedula;



    @Basic(optional = false)
    @Column(name="apellidos")
    private String apellidos;

    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;

    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;

    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;

    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;

    @Basic(optional = false)
    @Column(name = "fechNacimiento")
    private String fechNacimiento;

    
}
