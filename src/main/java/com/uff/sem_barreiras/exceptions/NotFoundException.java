package com.uff.sem_barreiras.exceptions;

public class NotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public NotFoundException(String nomeObjeto, Integer id){
        super( nomeObjeto + " com id = " + id +" não encontrado ");
    }

}
