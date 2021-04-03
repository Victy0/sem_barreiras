package com.uff.sem_barreiras.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.uff.sem_barreiras.dao.EmpresaDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    // listar todos os empresas
    public Page<Empresa> listarEmpresas( Specification<Empresa> spec, final Pageable page ) {
        return this.empresaDao.findAll(spec, page);
    }

    // encontrar empresa pelo id
    public Empresa encontrarEmpresa(Integer id) throws NotFoundException {
        try{
            return this.empresaDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Empresa", id);
        }
    }

    // salvar empresa
    public Empresa criarEmpresa(Empresa empresa) throws InsertException {
        try{
            return this.empresaDao.save(empresa);
        }catch(Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "a Empresa");
        }
    }

    // deletar empresa
    public void deletarEmpresa(Integer id) throws NotFoundException {
        try{
            this.empresaDao.deleteById(id);
        }catch(final Exception e ){
            throw new NotFoundException("Empresa", id);
        }
    }

    // alterar empresa
    public Empresa alterarEmpresa(Empresa empresa) throws IdNullException{
        if(empresa.getId() == null){
            throw new IdNullException("Empresa");
        }
        this.empresaDao.save(empresa);
        return this.empresaDao.findById(empresa.getId()).get();
    }

    public Integer getIdByEmail(String email){
        return this.empresaDao.getIdByEmail(email);
    }

    public void enviarCodigoVerificacao(String email){

        Integer id = this.empresaDao.getIdByEmail(email);
        Long milis = new Date().getTime();
        controleLogin.put(id, milis); 

        String content = String.format("E-mail enviado devido a solicitação de login em Sem Barreiras\n \n Código de verificação: %s", milis.toString().substring(milis.toString().length() - 4, milis.toString().length()) );

        this.emailService.enviar(email, "Sem Barreiras - Código de verificação", content);
    }

    public Boolean confirmarCodigoVerificacao(String email, String codigo){

        Integer id = this.empresaDao.getIdByEmail(email);

        if(!controleLogin.containsKey(id)){
            return false;
        }

        Long milis = controleLogin.get(id);
        if( !milis.toString().substring(milis.toString().length() - 4, milis.toString().length()).equals(codigo)){
            return false;
        }

        controleLogin.remove(id);
        return true;
    }

    @Autowired
    private EmpresaDao empresaDao;

    @Autowired
    private EmailService emailService;

    private Map<Integer, Long> controleLogin = new HashMap<Integer, Long>();
}
