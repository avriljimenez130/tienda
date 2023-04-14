package com.Tienda_v1.demo.dao;

import com.Tienda_v1.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario,Long> {
 
    Usuario findByUsername(String username);
}