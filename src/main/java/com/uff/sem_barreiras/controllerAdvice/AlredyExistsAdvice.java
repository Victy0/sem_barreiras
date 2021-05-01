package com.uff.sem_barreiras.controllerAdvice;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.AlredyExistsException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AlredyExistsAdvice {
    @ResponseBody
    @ExceptionHandler(AlredyExistsException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ResponseObject insertHandler(AlredyExistsException ex) {
        ResponseObject error = new ResponseObject(false, ex.getMessage());
        return error;
    }
}
