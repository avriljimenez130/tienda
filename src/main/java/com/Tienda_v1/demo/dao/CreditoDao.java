package com.Tienda_v1.demo.dao;

import com.Tienda_v1.demo.domain.Credito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditoDao extends JpaRepository<Credito,Long>{
    
}
