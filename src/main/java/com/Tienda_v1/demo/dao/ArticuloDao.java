package com.Tienda_v1.demo.dao;

import com.Tienda_v1.demo.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloDao extends JpaRepository<Articulo,Long>{
    
}
