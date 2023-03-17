package com.Tienda_v1.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id /*llave primaria PK*/ 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")  /*nombre real en la bse de datos, para todas las
    clases del domain que tengan asociacion*/
    private Long idCredito;
    
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        
        this.limite = limite;
    }
    
    
}
