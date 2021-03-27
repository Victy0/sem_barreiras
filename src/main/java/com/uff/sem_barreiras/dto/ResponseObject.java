package com.uff.sem_barreiras.dto;

import lombok.Data;

@Data
public class ResponseObject {

    public ResponseObject(boolean s, String m){
        this.sucesso = s;
        this.mensagem = m;
    }
    
    private boolean sucesso;

    private String mensagem;

}
