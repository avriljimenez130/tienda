package com.Tienda_v1.demo.dao;

import com.Tienda_v1.demo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente,Long>{
    
}
