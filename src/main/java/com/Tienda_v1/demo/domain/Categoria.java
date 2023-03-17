package com.Tienda_v1.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id /*llave primaria PK*/ 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")  /*nombre real en la bse de datos, para todas las
    clases del domain que tengan asociacion*/
    private Long idCategoria;
    
    private String descripcion;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

   

    
}
