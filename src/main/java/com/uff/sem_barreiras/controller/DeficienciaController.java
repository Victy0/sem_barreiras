package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Deficiencia;
import com.uff.sem_barreiras.service.DeficienciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeficienciaController {

    // mapeamento Get para listar todos os deficiencias
    @GetMapping("/deficiencia")
    public List<Deficiencia> listarDeficiencias() {
        return this.deficienciaService.listarDeficiencias();
    }

    // mapeamento Get para recuperar 1 deficiencia informando o id do mesmo
    @GetMapping("/deficiencia/{id}")
    public Deficiencia encontrarDeficiencia(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        try {
            return this.deficienciaService.encontrarDeficiencia(id);
        } catch (final Exception e) {
            throw new NotFoundException("Deficiencia");
        }
    }

    // mapeamento Post para criar uma deficiencia
    @PostMapping("/deficiencia")
    public Deficiencia criarDeficiencia(@RequestBody final Deficiencia deficiencia) {
        return this.deficienciaService.criarDeficiencia(deficiencia);
    }

    // mapeamento Delete para deletar 1 deficiencia informando o id do mesmo
    @DeleteMapping("/deficiencia/{id}")
    public Boolean deletarDeficiencia(@PathVariable(value = "id") final Integer id) {
        try {
            this.deficienciaService.deletarDeficiencia(id);
            return true;
        } catch (final Exception e) {
            //TODO: Fazer um tratamento mais apropriado.
            return false;
        }
    }

    @Autowired
    private DeficienciaService deficienciaService;
}
