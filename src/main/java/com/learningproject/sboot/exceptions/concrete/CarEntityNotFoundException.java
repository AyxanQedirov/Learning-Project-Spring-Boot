package com.learningproject.sboot.exceptions.concrete;

import com.learningproject.sboot.exceptions.abstracts.EntityNotFoundException;

public class CarEntityNotFoundException extends EntityNotFoundException {

    public CarEntityNotFoundException(String message) {
        super(message);
    }
}
