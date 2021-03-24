package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.model.Estado;
import com.uff.sem_barreiras.service.EstadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {
    
    // mapeamento Get para listar todos os estados
    @GetMapping ("/estado")
    public List<Estado> listarEstados(){
        return this.estadoService.listarEstados();
    }

    @Autowired
    private EstadoService estadoService;
}
