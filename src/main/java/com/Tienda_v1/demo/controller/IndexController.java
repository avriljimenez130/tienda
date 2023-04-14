package com.Tienda_v1.demo.controller;


import com.Tienda_v1.demo.service.ArticuloServices;
import com.Tienda_v1.demo.service.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController { //Esta clase controla todos los aspectos de clientes

    @Autowired
    private CategoriaServices clienteService;
    
    @Autowired
    private ArticuloServices articuloService;
    
    //Mapeo de una ruta
    @GetMapping("/")
    public String inicio(Model model) {
        var articulo = articuloService.getArticulos(false);
        
        model.addAttribute("articulos", articulo);
        
        return "index";
    }
}