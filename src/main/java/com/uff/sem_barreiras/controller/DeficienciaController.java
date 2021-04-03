package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Deficiencia;
import com.uff.sem_barreiras.service.DeficienciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        return this.deficienciaService.encontrarDeficiencia(id);
    }

    // mapeamento Post para criar uma deficiencia
    @PostMapping("/deficiencia")
    public ResponseObject criarDeficiencia(@RequestBody final Deficiencia deficiencia) throws InsertException {
        this.deficienciaService.criarDeficiencia(deficiencia);
        return new ResponseObject(true, "Deficiência salva com sucesso");
    }

    // mapeamento Delete para deletar 1 deficiencia informando o id do mesmo
    @DeleteMapping("/deficiencia/{id}")
    public ResponseObject deletarDeficiencia(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        this.deficienciaService.deletarDeficiencia(id);
        return new ResponseObject(true, "Deficiência removida com sucesso");
    }

     // mapeamento Put para alterar deficiencia
     @PutMapping("/deficiencia/alterar")
     public Deficiencia alterarDeficiencia(@RequestBody final Deficiencia deficiencia) throws NotFoundException, IdNullException {
         return this.deficienciaService.alterarDeficiencia(deficiencia);
     }

    @Autowired
    private DeficienciaService deficienciaService;
}
