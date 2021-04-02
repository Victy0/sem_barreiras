package com.uff.sem_barreiras.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.uff.sem_barreiras.dao.EmpresaDao;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.model.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    // listar todos os empresas
    public List<Empresa> listarEmpresas() {
        return this.empresaDao.findAll();
    }

    // encontrar empresa pelo id
    public Empresa encontrarEmpresa(Integer id) {
        return this.empresaDao.findById(id).get();
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
    public void deletarEmpresa(Integer id) {
        this.empresaDao.deleteById(id);
        return;
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
