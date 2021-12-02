package com.learningproject.sboot.exceptions.controller;

import com.learningproject.sboot.exceptions.abstracts.EntityNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EntityExceptionHandlerController {

    @ExceptionHandler({EntityNotFoundException.class})
    @ResponseBody
    public String entityNotFoundExceptionHandler(EntityNotFoundException e){
        return e.getMessage();
    }

}
