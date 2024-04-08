package com.logistic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistic.entity.MovementsEntity;
import com.logistic.service.IMovementsService;

@RestController
@RequestMapping(path = "land-logistic")
public class LandLogisticController {

    @Autowired
    IMovementsService movementsService;
    
    @GetMapping("/get")
    public List<MovementsEntity> get(){
        return movementsService.getAll();
    }

}