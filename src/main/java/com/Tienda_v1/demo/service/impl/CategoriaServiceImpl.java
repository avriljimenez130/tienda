package com.Tienda_v1.demo.service.impl;

import com.Tienda_v1.demo.dao.CategoriaDao;
import com.Tienda_v1.demo.domain.Categoria;
import com.Tienda_v1.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    

//Esto crea una unica copia de un objeto
    @Autowired   
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos) {
        var lista=(List<Categoria>) categoriaDao.findAll();
        /*recupero la lista*/
        if(activos){
            lista.removeIf(e -> !e.isActivo());
            /*Para borrar los elementos de la lista si el elemento no esta activo*/
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