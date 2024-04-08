package com.logistic.service;

import java.util.List;

import com.logistic.entity.MovementsEntity;

public interface IMovementsService {

    List<MovementsEntity> getAll();

    void insert(MovementsEntity data);

}