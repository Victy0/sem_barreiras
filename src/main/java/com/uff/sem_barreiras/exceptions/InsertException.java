package com.uff.sem_barreiras.exceptions;

public class InsertException extends Exception{

    private static final long serialVersionUID = 1L;

    public InsertException(String campo, String objeto){
        super( "Ausência do campo '" + campo + "' para realizar a criação d" + objeto);
    }
}
