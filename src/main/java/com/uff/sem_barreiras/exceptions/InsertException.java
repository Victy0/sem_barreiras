package com.uff.sem_barreiras.exceptions;

public class InsertException extends Exception{
    
    public InsertException(String campo, String objeto){
        super( "Ausência do campo '" + campo + "' para realizar a criação d" + objeto);
    }
}
