package com.planificateur.eventplanner.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    T getOne(Long id);
    T save(T t);
    void deleteById(Long id);
}
