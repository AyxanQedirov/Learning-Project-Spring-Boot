package com.learningproject.sboot.controller;

import com.learningproject.sboot.entity.concrete.CarEntity;
import com.learningproject.sboot.service.abstracts.CarManager;
import com.learningproject.sboot.service.concrete.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/{id}")
    public CarEntity getById(@PathVariable int id){
        return carService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody CarEntity car){

        carService.add(car);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable  int id){
        carService.delete(id);
    }
    @PutMapping
    public void update(@RequestBody CarEntity carEntity){
        carService.update(carEntity);
    }



}
