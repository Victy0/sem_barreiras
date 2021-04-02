package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.VagaDao;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Vaga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    public List<Vaga> listarVagas( ){
        return this.vagaDao.findAll();
    }

    public Vaga criarVaga(Vaga vaga) throws InsertException{
        try{
        return this.vagaDao.save(vaga);
        }catch(Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "a Vaga");
        }
    }

    public void deletarVaga(Integer id){
        this.vagaDao.deleteById(id);;
    }

    public Vaga encontrarVaga(Integer id) throws NotFoundException {
       try{
        return this.vagaDao.findById(id).get();
       }catch(Exception e){
         throw new NotFoundException("Vaga", id);
       }
    }

    public Boolean realizarCandidatura(String nome, String email, String telefone, Integer idVaga) throws NotFoundException {
        Vaga vaga = this.encontrarVaga(idVaga);

        String content = String.format("O candidato %s demonstrou interesse pela vaga \"%s\" disponibilizada.\nE-mail do candidato: %s\nTelefone do candidato: %s", nome, vaga.getResumo(), email, telefone );

        this.emailService.enviar(vaga.getEmpresa().getEmail(), "Interesse em vaga", content);

        return true;
    }

    @Autowired
    private VagaDao vagaDao;

    @Autowired
    private EmailService emailService;
}
