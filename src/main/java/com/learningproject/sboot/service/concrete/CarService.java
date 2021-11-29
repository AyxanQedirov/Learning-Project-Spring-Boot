package com.learningproject.sboot.service.concrete;

import com.learningproject.sboot.dao.abstracts.EntityRepository;
import com.learningproject.sboot.entity.concrete.CarEntity;
import com.learningproject.sboot.service.abstracts.CarManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements CarManager {

    private final EntityRepository<CarEntity> carRepository;

    public CarService(EntityRepository<CarEntity> carRepository){
        this.carRepository=carRepository;
    }

    @Override
    public List<CarEntity> getAll() {
        return carRepository.getAll();
    }

    @Override
    public CarEntity getById(int id) {
        return carRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        carRepository.delete(id);
    }

    @Override
    public void update(int id, CarEntity carEntity) {
        carRepository.update(id,carEntity);
    }

    @Override
    public void add(CarEntity carEntity) {
        carRepository.add(carEntity);
    }
}
