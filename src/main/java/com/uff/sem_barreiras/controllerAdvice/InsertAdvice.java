package com.uff.sem_barreiras.controllerAdvice;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.InsertException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InsertAdvice {
    
    @ResponseBody
    @ExceptionHandler(InsertException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ResponseObject insertHandler(InsertException ex) {
        ResponseObject error = new ResponseObject(false, ex.getMessage());
        return error;
    }
}
