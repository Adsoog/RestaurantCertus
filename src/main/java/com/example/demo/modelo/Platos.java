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
@Table(name ="platos")
@NamedQueries({
        @NamedQuery(name="Platos.findAll", query ="SELECT f FROM Platos f")
        ,@NamedQuery(name ="Platos.findByIdCedula", query = "SELECT f FROM Platos f WHERE f.idPlato = :idPlato")
        ,@NamedQuery(name = "Platos.findApellidos", query = "SELECT f FROM Platos f WHERE f.nombrePlato = : nombrePlato")
        ,@NamedQuery(name = "Platos.findPrecioPlato", query = "SELECT f FROM Platos f WHERE f.precioPlato = : precioPlato")

        ,@NamedQuery(name = "Platos.findTipoPlato", query = "SELECT f FROM Platos f WHERE f.tipoPlato = :tipoPlato")})
public class Platos implements Serializable {
    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idPlato")
    private Integer idPlato;
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
    @Column(name="nombrePlato")
    private String nombrePlato;

    @Basic(optional = false)
    @Column(name = "precioPlato")
    private String precioPlato;

    @Basic(optional = false)
    @Column(name = "tipoPlato")
    private String tipoPlato;

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





















