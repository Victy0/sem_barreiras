package com.uff.sem_barreiras.controller;

import java.util.Date;

import com.uff.sem_barreiras.dto.CandidatoDados;
import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Vaga;
import com.uff.sem_barreiras.service.VagaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@RestController
public class VagaController {
    @GetMapping("/vaga")
    public Page<Vaga> listarVagas(
        @And( value = {	@Spec( path = "empresa.id", params = "empresa", spec = Equal.class ),
                        @Spec( path = "empresa.cidade.estado.id", params = "estado", spec = Equal.class ),
						@Spec( path = "area.id", params = "area", spec = Equal.class ),
                        @Spec( path = "escolaridade.id", params = "escolaridade", spec = Equal.class ),
						@Spec( path = "remuneracao", spec = GreaterThanOrEqual.class ),
                        @Spec( path = "resumo", params = "pesq", spec = Like.class )} ) Specification<Vaga> spec,
        @RequestParam( name = "deficiencia", required = false ) final Integer deficiencia,
		@PageableDefault( size = 50, sort = "id" ) final Pageable page
    ){ 
        if(deficiencia != null){
            if(spec == null){
                spec = this.vagaService.hasDeficiencia(deficiencia);
            }else{
                spec = spec.and(this.vagaService.hasDeficiencia(deficiencia));
            }
        }
        return this.vagaService.listarVagas(spec, page);
    }

    @GetMapping("/vaga/{id}")
    public Vaga encontrar(@PathVariable( value = "id" ) final Integer id)throws NotFoundException{
        return this.vagaService.encontrarVaga(id);
    }

    @PostMapping("/vaga") 
    public Vaga cadastrar(@RequestBody final Vaga vaga  ) throws InsertException{
        vaga.setDataCriacao(new Date());
        return this.vagaService.criarVaga(vaga);
    }
    
    @DeleteMapping("/vaga/{id}")
    public ResponseObject deletar(@PathVariable(value = "id")Integer id){
        this.vagaService.deletarVaga(id);
        return new ResponseObject(true, "Vaga removida com sucesso");
    }

    // mapeamento Put para alterar vaga
    @PutMapping("/vaga/alterar")
    public Vaga alterarVaga(@RequestBody final Vaga vaga) throws NotFoundException, IdNullException {
        vaga.setDataCriacao(new Date());
        return this.vagaService.alterarVaga(vaga);
    }

    @PostMapping("/vaga/candidatar/{id}")
    public ResponseObject candidatarAVaga(@RequestBody CandidatoDados candidato, @PathVariable(value = "id")Integer idVaga) throws NotFoundException{
        this.vagaService.realizarCandidatura(candidato.getNome(), candidato.getEmail(), candidato.getTelefone(), idVaga);
        return new ResponseObject(true, "Candidatura realizada com sucesso");
    }

    @Autowired
    private VagaService vagaService ;
}
