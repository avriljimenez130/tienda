package com.Tienda_v1.demo.service;

import com.Tienda_v1.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Obtiene la lista de egistros de la tabla categorias
    //y lo coloca en una lista de objetos categoria
    public List<Categoria> getCategorias(boolean activos);
    
    //Obtiene un registro de la tabla ciente
    //  que tiene el idCategoria pasado por el objeto ciente.
    public Categoria getCategoria (Categoria categoria);
    
    
     //elimina el registro de la tabla ciente
    //  que tiene el idCategoria pasado por el objeto ciente.
    public void deleteCategoria(Categoria categoria);
    
    //Si el idCategoria pasano no existe o es nulo se crea un registro nuevo
    //en la tabla categoria 
    //si el idCategoria existe.. se  actualiza la informacion
    public void saveCategoria(Categoria categoria);
}
