package com.uff.sem_barreiras.controllerAdvice;

import lombok.Data;

@Data
public class ErrorObject {
    
    private boolean sucesso = false;

    private String mensagem;

}
