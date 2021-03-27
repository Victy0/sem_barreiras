package com.uff.sem_barreiras.controllerAdvice;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.dto.ResponseObject;

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
    ResponseObject notFoundHandler(NotFoundException ex) {
        ResponseObject error = new ResponseObject(false, ex.getMessage());
        return error;
    }
}
