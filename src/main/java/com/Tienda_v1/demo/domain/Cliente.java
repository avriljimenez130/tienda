package com.Tienda_v1.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id /*llave primaria PK*/ 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")  /*nombre real en la bse de datos, para todas las
    clases del domain que tengan asociacion*/
    private Long idCliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    @JoinColumn(name="id_credito", referencedColumnName="id_credito")  /*nombre real en la bse de datos, para todas las
    clases del domain que tengan asociacion*/
    @ManyToOne
    private Credito credito;
    
    public Cliente() {
        
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono, Credito credito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.credito = credito;
    }
    
    
}
