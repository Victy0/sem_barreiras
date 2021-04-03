package com.uff.sem_barreiras.controllerAdvice;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class IdNullAdvice {
    
    @ResponseBody
    @ExceptionHandler(IdNullException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ResponseObject insertHandler(IdNullException ex) {
        ResponseObject error = new ResponseObject(false, ex.getMessage());
        return error;
    }
}

