package com.uff.sem_barreiras.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.uff.sem_barreiras.dto.LoginObject;
import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Empresa;
import com.uff.sem_barreiras.service.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    // mapeamento Get para listar todos os empresas
    @GetMapping("/empresa")
    public List<Empresa> listarEmpresas() {
        return this.empresaService.listarEmpresas();
    }

    // mapeamento Get para recuperar 1 empresa informando o id do mesmo
    @GetMapping("/empresa/{id}")
    public Empresa encontrarEmpresa(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        try {
            return this.empresaService.encontrarEmpresa(id);
        } catch (final Exception e) {
            throw new NotFoundException("Empresa", id);
        }
    }

    // mapeamento Post para criar uma empresa
    @PostMapping("/empresa")
    public Empresa criarEmpresa(@RequestBody final Empresa empresa) throws InsertException {
        return this.empresaService.criarEmpresa(empresa);
    }

    // mapeamento Delete para deletar 1 empresa informando o id do mesmo
    @DeleteMapping("/empresa/{id}")
    public ResponseObject deletarEmpresa(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        this.empresaService.deletarEmpresa(id);
        return new ResponseObject(false, "Área de atuação removida com sucesso");
    }

    // mapeamento Post para login de empresa
    @PostMapping("/empresa/login")
    public ResponseObject loginEmpresa(@RequestBody final LoginObject login  ){
        Integer id = this.empresaService.getIdByEmail(login.getEmail());
        if(id == null){
            return new ResponseObject(false, "Empresa não cadastrada");
        }

        this.empresaService.enviarCodigoVerificacao(login.getEmail());

        return new ResponseObject(true, "Código de verificação enviado por e-mail");

    }

    // mapeamento Post para confirmar login de empresa por código de autentificação
    @PostMapping("/empresa/login-confirma")
    public ResponseObject loginEmpresa( @RequestBody final LoginObject login, HttpSession session  ){
        
        if(this.empresaService.confirmarCodigoVerificacao(login.getEmail(), login.getCodigo())){
            session.setAttribute("login", this.empresaService.getIdByEmail(login.getEmail()));
            return new ResponseObject(true, "Autentificação concluída com sucesso");
        }

        return new ResponseObject(false, "Erro de autentificação");

    }

    // mapeamento Put para alterar empresa
    @PutMapping("/empresa/alterar")
    public Empresa alterarempresa(@RequestBody final Empresa empresa) throws NotFoundException, IdNullException {
        return this.empresaService.alterarEmpresa(empresa);
    }

    @Autowired
    private EmpresaService empresaService;

}
