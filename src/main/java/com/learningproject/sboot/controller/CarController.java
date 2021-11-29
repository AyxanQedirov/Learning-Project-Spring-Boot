package com.learningproject.sboot.controller;

import com.learningproject.sboot.entity.concrete.CarEntity;
import com.learningproject.sboot.service.abstracts.CarManager;
import com.learningproject.sboot.service.concrete.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    private final CarManager carService;

    public CarController(CarManager carService){
        this.carService=carService;
    }

    @GetMapping
    public List<CarEntity> getAll(){
        return carService.getAll();
    }

}
