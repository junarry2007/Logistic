package com.logistic.service;

import java.util.List;
import java.util.Optional;

import com.logistic.entity.StoreEntity;

public interface IStoreService {

    List<StoreEntity> getAll();

    Optional<StoreEntity> getById(Integer id);

}