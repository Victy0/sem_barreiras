package com.uff.sem_barreiras.exceptions;

public class InsertException extends Exception{

    private static final long serialVersionUID = 1L;

    public InsertException( String objeto ){
        super( "Ausência ou incoerência em campos para realizar a criação d" + objeto);
    }



}
