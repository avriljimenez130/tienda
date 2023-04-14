package com.Tienda_v1.demo.service.impl;

import com.Tienda_v1.demo.dao.ArticuloDAO;
import com.Tienda_v1.demo.domain.Articulo;
import com.Tienda_v1.demo.service.ArticuloServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImpl implements ArticuloServices{

    //Esto crea una unica copia de un objeto
    @Autowired
    private ArticuloDAO articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos) {
        var lista=(List<Articulo>) articuloDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    public void deleteArticulo(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public void saveArticulo(Articulo articulo) {
        articuloDao.save(articulo);
    }
}