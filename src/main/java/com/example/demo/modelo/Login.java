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
@Table(name ="login")
@NamedQueries({
        @NamedQuery(name="Login.findAll", query ="SELECT f FROM Login f")
        ,@NamedQuery(name ="Login.findBycedula", query = "SELECT f FROM Login f WHERE f.cedula = :cedula")
        ,@NamedQuery(name ="Login.findapellidos", query = "SELECT f FROM Login f WHERE f.apellidos= :apellidos")
        ,@NamedQuery(name ="Login.findnombres", query = "SELECT f FROM Login f WHERE f.nombres= :nombres")
        ,@NamedQuery(name ="Login.findtelefono", query = "SELECT f FROM Login f WHERE f.telefono = :telefono")
        ,@NamedQuery(name = "Login.finddireccion", query = "SELECT f FROM Login f WHERE f.direccion = : direccion")
        ,@NamedQuery(name = "Login.findGenero", query = "SELECT f FROM Login f WHERE f.genero = : genero")
        ,@NamedQuery(name = "Login.findPassword", query = "SELECT f FROM Login f WHERE f.password = : password")

        })
public class Login implements Serializable {
    private static final long serialVersionUID=1l;

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
    @Column(name = "password")
    private String password;


}
