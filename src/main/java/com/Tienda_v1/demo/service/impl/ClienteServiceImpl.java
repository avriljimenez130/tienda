package com.Tienda_v1.demo.service.impl;

import com.Tienda_v1.demo.dao.ClienteDao;
import com.Tienda_v1.demo.dao.CreditoDao;
import com.Tienda_v1.demo.domain.Cliente;
import com.Tienda_v1.demo.domain.Credito;
import com.Tienda_v1.demo.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    

//Esto crea una unica copia de un objeto
    @Autowired   
    private ClienteDao clienteDao;
    
    @Autowired   
    private CreditoDao creditoDao;
    
    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito=creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }
}