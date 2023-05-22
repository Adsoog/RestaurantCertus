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
@Table(name ="pedido")
@NamedQueries({
        @NamedQuery(name="Pedido.findAll", query ="SELECT f FROM Pedido f")
        ,@NamedQuery(name ="Pedido.findByIdPedido", query = "SELECT f FROM Pedido f WHERE f.idPedido = :idPedido")
        ,@NamedQuery(name = "Pedido.findDelivery", query = "SELECT f FROM Pedido f WHERE f.delivery = : delivery")
        ,@NamedQuery(name = "Pedido.findCosto", query = "SELECT f FROM Pedido f WHERE f.costo = : costo")

        ,@NamedQuery(name = "Pedido.findPlato", query = "SELECT f FROM Pedido f WHERE f.plato = :plato")
})
public class Pedido implements Serializable {
    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idPedido")
    private Integer idPedido;
    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "platillo")
    //private List<Ventas> idPlato = new ArrayList<>();

    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "platillo",cascade =CascadeType.ALL)
    //private Integer idPlato;




    //private Integer idPlato;

    //NUEVO -->PARA ARREGLAR SOLO DESCOMENTTAR LA LINEA 39 Y BORARR 42 Y 43
    //@OneToMany(fetch = FetchType.LAZY,mappedBy = "platillo",cascade =CascadeType.ALL)
    //private Set<Ventas> idPlato;

    ///OMITIR TARDE POR EL MOMENTO
    @Basic(optional = false)
    @Column(name="delivery")
    private String delivery;

    @Basic(optional = false)
    @Column(name = "plato")
    private String plato;

    @Basic(optional = false)
    @Column(name = "costo")
    private String costo;

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

    //---------------------------
    //NUEVO----este es nuevo
    /*
    @JoinColumn(name="delivery", referencedColumnName = "idDelivery")
    @ManyToOne(optional = false)
    private Delivery delivery;*/
}
