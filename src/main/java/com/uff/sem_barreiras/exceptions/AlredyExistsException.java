package com.uff.sem_barreiras.exceptions;

public class AlredyExistsException extends Exception{
    
    private static final long serialVersionUID = 1L;

    public AlredyExistsException(String nomeObjeto){
        super( "Já existe " + nomeObjeto );
    }
}
