package com.uff.sem_barreiras.exceptions;

public class IdNullException extends Exception{
    
    private static final long serialVersionUID = 1L;

    public IdNullException(String nomeObjeto){
        super( "Não informado id para " + nomeObjeto + " que se deseja alterar" );
    }
}
