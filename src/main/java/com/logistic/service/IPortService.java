package com.logistic.service;

import java.util.List;
import java.util.Optional;

import com.logistic.entity.PortEntity;

public interface IPortService {

    List<PortEntity> getAll();

    Optional<PortEntity> getById(Integer id);

}