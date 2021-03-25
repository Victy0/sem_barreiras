package com.uff.sem_barreiras.exceptions;

public class NotFoundException extends Exception{

    public NotFoundException(String nomeObjeto){
        super( nomeObjeto + " não encontrado");
    }

}
