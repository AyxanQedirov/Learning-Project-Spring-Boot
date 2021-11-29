package com.learningproject.sboot.utility.localdatabase;

import com.learningproject.sboot.entity.concrete.CarEntity;

import java.util.Arrays;
import java.util.List;

public class LocalData {

    public static List<CarEntity> cars= Arrays.asList(
            new CarEntity(1,"Ford Festiva 4",15,"black","gas"),
            new CarEntity(2,"Honda Civic 4",12,"gray","diesel"),
            new CarEntity(3,"Toyota Corolla 4",12,"white","diesel"),
            new CarEntity(4,"Ford Mustang V8",20,"yellow","gas"),
            new CarEntity(5,"Audi 80 4",19,"white","gas"),
            new CarEntity(6,"Mitsubishi Galant 4",15,"red","gas"),
            new CarEntity(7,"Mitsubishi Sigma V6",18,"parlament blue","diesel")
    );
}
