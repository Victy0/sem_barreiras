package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CandidatoDao;
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

    public Candidato criarCandidato(Candidato candidato){
        return this.candidatoDao.save(candidato);
    }

    public Candidato dencontrarCandidato(Integer id){
        return this.candidatoDao.getOne(id);
    }

    public Boolean atrelarCandidatura(Integer idCandidato, Integer idVaga) {
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
