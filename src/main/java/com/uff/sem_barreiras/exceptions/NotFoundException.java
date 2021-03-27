package com.uff.sem_barreiras.exceptions;

public class NotFoundException extends Exception{

    public NotFoundException(String nomeObjeto, Integer id){
        super( nomeObjeto + " com id = " + id +" não encontrado ");
    }

}
