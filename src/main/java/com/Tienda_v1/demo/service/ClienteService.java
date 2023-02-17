package com.Tienda_v1.demo.service;

import com.Tienda_v1.demo.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    //Obtiene la lista de egistros de la tabla clientes
    //y lo coloca en una lista de objetos cliente
    public List<Cliente> getClientes();
    
    //Obtiene un registro de la tabla ciente
    //  que tiene el idCliente pasado por el objeto ciente.
    public Cliente getCliente (Cliente cliente);
    
    
     //elimina el registro de la tabla ciente
    //  que tiene el idCliente pasado por el objeto ciente.
    public void deleteCliente(Cliente cliente);
    
    //Si el idCliente pasano no existe o es nulo se crea un registro nuevo
    //en la tabla cliente 
    //si el idCliente existe.. se  actualiza la informacion
    public void saveCliente(Cliente cliente);
}
