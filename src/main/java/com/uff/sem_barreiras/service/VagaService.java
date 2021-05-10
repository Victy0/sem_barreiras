package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.VagaDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Vaga;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    public Page<Vaga> listarVagas( Specification<Vaga> spec, final Pageable page ){
        final Page<Vaga> base =  this.vagaDao.findAll(spec, page);
        return base;
    }

    public Vaga criarVaga(Vaga vaga) throws InsertException{
        try{
            return this.vagaDao.save(vaga);
        }catch(Exception e){
            throw new InsertException( "a Vaga" );
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

    // alterar vaga
    public Vaga alterarVaga(Vaga vaga) throws IdNullException{
        if(vaga.getId() == null){
            throw new IdNullException("Vaga");
        }
        this.vagaDao.save(vaga);
        return this.vagaDao.findById(vaga.getId()).get();
    }

    public Boolean realizarCandidatura(String nome, String email, String telefone, Integer idVaga) throws NotFoundException {
        Vaga vaga = this.encontrarVaga(idVaga);

        String content = String.format("O candidato %s demonstrou interesse pela vaga \"%s\" disponibilizada.\nE-mail do candidato: %s\nTelefone do candidato: %s", nome, vaga.getResumo(), email, telefone );

        this.emailService.enviar(vaga.getEmpresa().getEmail(), "Interesse em vaga", content);

        return true;
    }

    @Scheduled( cron = "${cronSchedule.limpaControleLogin:-}", zone = "${cronSchedule.timeZone:-}" )
    private void deletarVagaPassado30Dias(){
        List<Integer> idsParaRemover = this.vagaDao.recuperaVagaPassado30Dias();
        for(Integer idRemover : idsParaRemover){
            this.deletarVaga(idRemover);
        }
    }

    // Subquery using Cat membership in the Owner.cats relation
    public Specification<Vaga> hasDeficiencia(final Integer deficienciaId) {

        List<Integer> idList = this.vagaDao.idVagasByDeficiencia(deficienciaId);
        return ( root, query, cb ) -> {

            return root.get( "id" ).in( idList );
        };

    }

    @Autowired
    private VagaDao vagaDao;

    @Autowired
    private EmailService emailService;
}
