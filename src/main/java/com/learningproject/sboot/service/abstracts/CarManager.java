package com.learningproject.sboot.service.abstracts;

import com.learningproject.sboot.entity.concrete.CarEntity;

import java.util.List;

public interface CarManager {
    List<CarEntity> getAll();
    CarEntity getById(int id);
    void delete(int id);
    void update(int id,CarEntity carEntity);
    void add(CarEntity carEntity);
}
