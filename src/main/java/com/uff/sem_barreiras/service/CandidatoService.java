package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CandidatoDao;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Candidato;
import com.uff.sem_barreiras.model.Vaga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CandidatoService {

    public List<Candidato> listarCandidatos(){
        return this.candidatoDao.findAll();
    }

    public Candidato encontrarCandidato(Integer id){
        return this.candidatoDao.getOne(id);
    }

    public Candidato criarCandidato(Candidato candidato) throws InsertException{
        try{
        return this.candidatoDao.save(candidato);
        }catch(Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "a Candidato");
        }
    }

    public Candidato dencontrarCandidato(Integer id){
        return this.candidatoDao.getOne(id);
    }

    public Boolean atrelarCandidatura(Integer idCandidato, Integer idVaga) throws NotFoundException {
        Candidato candidato  = this.candidatoDao.getOne(idCandidato);
        Vaga vaga = this.vagaService.encontrarVaga(idVaga);
        if(candidato.getEscolaridade().getGrau() >= vaga.getEscolaridade().getGrau()){
            return false;
        }
        List<Vaga> vagasCandidato = candidato.getVagas();
        vagasCandidato.add(vaga);
        candidato.setVagas(vagasCandidato);
        this.candidatoDao.save(candidato);
        return true;
    }

    @Autowired
    private CandidatoDao candidatoDao; 

    @Autowired
    private VagaService vagaService;
}
