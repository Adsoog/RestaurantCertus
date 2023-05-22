package com.example.demo.modelo;
import java.io.Serializable;
import java.util.List;
//libreria utlima
import com.fasterxml.jackson.annotation.JsonBackReference;


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
@Table(name ="sede")
@NamedQueries({
        @NamedQuery(name="Sede.findAll", query ="SELECT f FROM Sede f")
        ,@NamedQuery(name ="Sede.findByIdSede", query = "SELECT f FROM Sede f WHERE f.idSede = :idSede")
        ,@NamedQuery(name ="Sede.findNombreSede", query = "SELECT f FROM Sede f WHERE f.nombreSede = :nombreSede")
        ,@NamedQuery(name = "Sede.findDireccionSede", query = "SELECT f FROM Sede f WHERE f.direccionSede = : direccionSede")
        ,@NamedQuery(name = "Sede.findCategoriaSede", query = "SELECT f FROM Sede f WHERE f.categoriaSede = : categoriaSede")

        ,@NamedQuery(name = "Sede.findCineSede ", query = "SELECT f FROM Sede f WHERE f.cineSede = :cineSede")})
public class Sede implements Serializable {
    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idSede")
    private Integer idSede;
    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "platillo")
    //private List<Ventas> idPlato = new ArrayList<>();

    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "platillo",cascade =CascadeType.ALL)
    //private Integer idPlato;




    //private Integer idPlato;

    //NUEVO -->PARA ARREGLAR SOLO DESCOMENTTAR LA LINEA 39 Y BORARR 42 Y 43
    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "platillo",cascade =CascadeType.ALL)
    //private Set<Ventas> idPlato;

    @Basic(optional = false)
    @Column(name="nombreSede")
    private String nombreSede;

    @Basic(optional = false)
    @Column(name = "direccionSede")
    private String direccionSede;

    @Basic(optional = false)
    @Column(name = "categoriaSede")
    private String categoriaSede;

    @Basic(optional = false)
    @Column(name = "cineSede")
    private String cineSede;

    // ----------------------codigo de los @onetomany para platos
    //@OneToMany(cascade = CascadeType.ALL,mappedBy = "idPlato" ,fetch=FetchType.LAZY)
    //@JsonBackReference(value="Plato_func")
    //private List<Ventas> platosList;


    // @XmlTransient


    //public List<Ventas> getPlatosList() {
    //return platosList;
    //}

    //public void setPlatosList(List<Ventas> platosList) {
    //this.platosList = platosList;
    //}
}
