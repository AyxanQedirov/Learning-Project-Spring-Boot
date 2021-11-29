package com.learningproject.sboot.dao.concrete;

import com.learningproject.sboot.dao.abstracts.EntityRepository;
import com.learningproject.sboot.entity.concrete.CarEntity;
import com.learningproject.sboot.utility.localdatabase.LocalData;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarRepository implements EntityRepository<CarEntity> {
    @Override
    public List<CarEntity> getAll() {
        return LocalData.cars;
    }

    @Override
    public CarEntity getById(int id) {
        return LocalData.cars.stream().filter(c->c.getId()==id).collect(Collectors.toList()).get(0);
    }

    @Override
    public void add(CarEntity entity) {
        LocalData.cars.add(entity);
    }

    @Override
    public void update(int id, CarEntity entity) {
        LocalData.cars.stream().filter(c->c.getId()==id).forEach(c-> {
            LocalData.cars.remove(c);
        });

        LocalData.cars.add(entity);
    }

    @Override
    public void delete(int id) {
        LocalData.cars.stream().filter(c->c.getId()==id).forEach(c->LocalData.cars.remove(c));
    }
}
