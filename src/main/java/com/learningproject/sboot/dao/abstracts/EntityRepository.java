package com.learningproject.sboot.dao.abstracts;

import com.learningproject.sboot.entity.abstracts.Entity;

import java.util.List;

public interface EntityRepository <T extends Entity>{

    List<T> getAll();
    T getById(int id);
    void add(T entity);
    void update(int id,T entity);
    void delete(int id);


}
