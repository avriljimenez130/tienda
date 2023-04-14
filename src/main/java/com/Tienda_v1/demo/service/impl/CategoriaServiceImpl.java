package com.Tienda_v1.demo.service.impl;

import com.Tienda_v1.demo.dao.CategoriaDAO;
import com.Tienda_v1.demo.domain.Categoria;
import com.Tienda_v1.demo.service.CategoriaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaServices{

    //Esto crea una unica copia de un objeto
    @Autowired
    private CategoriaDAO categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos) {
        var lista=(List<Categoria>) categoriaDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    public void deleteCategoria(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    public void saveCategoria(Categoria categoria) {
        categoriaDao.save(categoria);
    }
}