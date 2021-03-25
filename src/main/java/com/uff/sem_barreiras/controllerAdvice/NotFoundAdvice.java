package com.uff.sem_barreiras.controllerAdvice;

import com.uff.sem_barreiras.exceptions.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ErrorObject notFoundHandler(NotFoundException ex) {
        ErrorObject error = new ErrorObject();
        error.setMensagem(ex.getMessage());
        return error;
    }
}
