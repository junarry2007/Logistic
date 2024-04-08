package com.logistic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistic.entity.MovementsEntity;
import com.logistic.repository.IMovementsRespository;

@Service
public class MovementsService implements IMovementsService {

    @Autowired
    IMovementsRespository movementsRespository;

    @Override
    public List<MovementsEntity> getAll() {
        return movementsRespository.findAll();
    }

    public void insert(MovementsEntity data){
        movementsRespository.save(data);
    }

}