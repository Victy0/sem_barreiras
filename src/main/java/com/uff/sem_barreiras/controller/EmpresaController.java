package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Empresa;
import com.uff.sem_barreiras.service.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    // mapeamento Get para listar todos os empresas
    @GetMapping("/empresa")
    public List<Empresa> listarEmpresas() {
        return this.empresaService.listarEmpresas();
    }

    // mapeamento Get para recuperar 1 empresa informando o id do mesmo
    @GetMapping("/empresa/{id}")
    public Empresa encontrarEmpresa(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        try {
            return this.empresaService.encontrarEmpresa(id);
        } catch (final Exception e) {
            throw new NotFoundException("Empresa", id);
        }
    }

    // mapeamento Post para criar uma empresa
    @PostMapping("/empresa")
    public Empresa criarEmpresa(@RequestBody final Empresa empresa) {
        return this.empresaService.criarEmpresa(empresa);
    }

    // mapeamento Delete para deletar 1 empresa informando o id do mesmo
    @DeleteMapping("/empresa/{id}")
    public Boolean deletarEmpresa(@PathVariable(value = "id") final Integer id) {
        try {
            this.empresaService.deletarEmpresa(id);
            return true;
        } catch (final Exception e) {
            //TODO: Fazer um tratamento mais apropriado.
            return false;
        }
    }

    @Autowired
    private EmpresaService empresaService;
}
