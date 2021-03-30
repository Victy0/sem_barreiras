package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CandidatoDao;
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
        return this.candidatoDao.findById(id).get();
    }

    public Candidato criarCandidato(Candidato candidato){
        return this.candidatoDao.save(candidato);
    }

    public Candidato atualizarCandidato(Candidato candidato){
        Candidato candidatoSalvo = this.encontrarCandidato(candidato.getId());
        if(!candidatoSalvo.getEmail().equals(candidato.getEmail())){
            Integer qtd = this.candidatoDao.countByEmail(candidato.getEmail());
            if(qtd > 0){
                return new Candidato();
            }
        }
        return this.candidatoDao.save(candidato);
    }

    public Boolean atrelarCandidatura(Integer idCandidato, Integer idVaga) throws NotFoundException {
        Candidato candidato  = this.encontrarCandidato(idCandidato);
        Vaga vaga = this.vagaService.encontrarVaga(idVaga);
        if(candidato.getEscolaridade().getGrau() >= vaga.getEscolaridade().getGrau()){
            return false;
        }
        List<Vaga> vagasCandidato = candidato.getVagas();
        vagasCandidato.add(vaga);
        candidato.setVagas(vagasCandidato);
        this.candidatoDao.save(candidato);

        String content = String.format("O candidato %s demonstrou interesse pela vaga \"%s\" disponibilizada.\nE-mail do candidato: %s\nTelefone do candidato: %s", candidato.getNome(), vaga.getResumo(), candidato.getEmail(), candidato.getTelefone() );

        this.emailService.enviar(vaga.getEmpresa().getEmail(), "Interesse em vaga", content);

        return true;
    }

    public Boolean realizarCandidatura(String nome, String email, String telefone, Integer idVaga) throws NotFoundException {
        Vaga vaga = this.vagaService.encontrarVaga(idVaga);
        
        // TODO: necessário avaliar escolaridade de não cadastrados ?
        /*if(candidato.getEscolaridade().getGrau() >= vaga.getEscolaridade().getGrau()){
            return false;
        }*/

        String content = String.format("O candidato %s demonstrou interesse pela vaga \"%s\" disponibilizada.\nE-mail do candidato: %s\nTelefone do candidato: %s", nome, vaga.getResumo(), email, telefone );

        this.emailService.enviar(vaga.getEmpresa().getEmail(), "Interesse em vaga", content);

        return true;
    }

    @Autowired
    private CandidatoDao candidatoDao; 

    @Autowired
    private VagaService vagaService;

    @Autowired
    private EmailService emailService;
}
