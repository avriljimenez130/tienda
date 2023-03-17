package com.Tienda_v1.demo.dao;

import com.Tienda_v1.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}
