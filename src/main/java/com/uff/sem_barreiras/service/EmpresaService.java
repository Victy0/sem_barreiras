package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.EmpresaDao;
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
    public Empresa criarEmpresa(Empresa empresa) {
        return this.empresaDao.save(empresa);
    }

    // deletar empresa
    public void deletarEmpresa(Integer id) {
        this.empresaDao.deleteById(id);
        return;
    }

    @Autowired
    private EmpresaDao empresaDao;
}
