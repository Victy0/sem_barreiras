package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.DeficienciaDao;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.model.Deficiencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeficienciaService {

    // listar todos os deficiencias
    public List<Deficiencia> listarDeficiencias() {
        return this.deficienciaDao.findAll();
    }

    // encontrar deficiencia pelo id
    public Deficiencia encontrarDeficiencia(Integer id) {
        return this.deficienciaDao.findById(id).get();
    }

    // salvar deficiencia
    public Deficiencia criarDeficiencia(Deficiencia deficiencia) throws InsertException {
        try{
            return this.deficienciaDao.save(deficiencia);
            }catch(Exception e){
                String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
                throw new InsertException(text, "a Deficiencia");
            }
    }

    // deletar deficiencia
    public void deletarDeficiencia(Integer id) {
        this.deficienciaDao.deleteById(id);
        return;
    }

    @Autowired
    private DeficienciaDao deficienciaDao;
}
