package com.Tienda_v1.demo.service;

import com.Tienda_v1.demo.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    //Obtiene la lista de egistros de la tabla articulos
    //y lo coloca en una lista de objetos articulo
    public List<Articulo> getArticulos(boolean activos);
    
    //Obtiene un registro de la tabla ciente
    //  que tiene el idArticulo pasado por el objeto ciente.
    public Articulo getArticulo (Articulo articulo);
    
    
     //elimina el registro de la tabla ciente
    //  que tiene el idArticulo pasado por el objeto ciente.
    public void deleteArticulo(Articulo articulo);
    
    //Si el idArticulo pasano no existe o es nulo se crea un registro nuevo
    //en la tabla articulo 
    //si el idArticulo existe.. se  actualiza la informacion
    public void saveArticulo(Articulo articulo);
}
