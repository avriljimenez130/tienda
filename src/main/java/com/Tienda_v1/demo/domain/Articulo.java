package com.Tienda_v1.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id /*llave primaria PK*/ 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")  /*nombre real en la bse de datos, para todas las
    clases del domain que tengan asociacion*/
    private Long idArticulo;
    
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String imagen;
    private boolean activo;

    
    @JoinColumn(name="id_categoria", referencedColumnName="id_categoria")  /*nombre real en la bse de datos, para todas las
    clases del domain que tengan asociacion*/
    @ManyToOne
    private Categoria categoria;
    
    public Articulo() {
    }

    public Articulo(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo, Categoria categoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.imagen = imagen;
        this.activo = activo;
        this.categoria = categoria;
    }

    
}
