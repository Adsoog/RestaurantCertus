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
@Table(name ="delivery")
@NamedQueries({
        @NamedQuery(name="Delivery.findAll", query ="SELECT f FROM Delivery f")
        ,@NamedQuery(name ="Delivery.findByIdDelivery", query = "SELECT f FROM Delivery f WHERE f.idDelivery = :idDelivery")
        ,@NamedQuery(name = "Delivery.findNombre", query = "SELECT f FROM Delivery f WHERE f.nombre = : nombre")
        ,@NamedQuery(name = "Delivery.findPlato", query = "SELECT f FROM Delivery f WHERE f.plato = : plato")

        ,@NamedQuery(name = "Delivery.findLugar", query = "SELECT f FROM Delivery f WHERE f.lugar = :lugar")})
public class Delivery implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idDelivery")
    private Integer idDelivery;
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
    @Column(name="nombre")
    private String nombre;

    @Basic(optional = false)
    @Column(name = "plato")
    private String plato;

    @Basic(optional = false)
    @Column(name = "lugar")
    private String lugar;
    /////////////////////////////agregado ahorita Tarde

    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "delivery")
    @JsonBackReference(value="delivery_func")
    private List<Pedido> pedidoList;
    */
    /////////generacion
    /*
    public Integer getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Integer idDelivery) {
        this.idDelivery = idDelivery;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }
    //mas generacion

    public Delivery(Integer idDelivery) {
        this.idDelivery = idDelivery;
    }

    public Delivery(Integer idDelivery, String nombre) {
        this.idDelivery = idDelivery;
        this.nombre = nombre;
    }
    */
}
