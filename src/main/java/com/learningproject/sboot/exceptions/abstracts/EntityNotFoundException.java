package com.learningproject.sboot.exceptions.abstracts;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String message){
        super(message);
    }

}
