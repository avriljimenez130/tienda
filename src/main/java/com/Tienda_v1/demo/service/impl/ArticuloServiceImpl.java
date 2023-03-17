package com.Tienda_v1.demo.service.impl;

import com.Tienda_v1.demo.dao.ArticuloDao;
import com.Tienda_v1.demo.domain.Articulo;
import com.Tienda_v1.demo.service.ArticuloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImpl implements ArticuloService{
    

//Esto crea una unica copia de un objeto
    @Autowired   
    private ArticuloDao articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos) {
        var lista=(List<Articulo>) articuloDao.findAll();
        /*recupero la lista*/
        if(activos){
            lista.removeIf(e -> !e.isActivo());
            /*Para borrar los elementos de la lista si el elemento no esta activo*/
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