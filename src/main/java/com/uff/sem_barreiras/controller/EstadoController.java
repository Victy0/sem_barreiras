package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Estado;
import com.uff.sem_barreiras.service.EstadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {
    
    // mapeamento Get para listar todos os estados
    @GetMapping("/estado")
    public List<Estado> listarEstados(){
        return this.estadoService.listarEstados();
    }

    //mapeamento Get para recuperar 1 estado informando o id do mesmo
    @GetMapping("/estado/{id}")
    public Estado encontrarEstado(@PathVariable( value = "id" ) final Integer id) throws NotFoundException{
        return this.estadoService.encontrarEstado(id);
    }

    @Autowired
    private EstadoService estadoService;
}
