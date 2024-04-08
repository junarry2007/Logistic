package com.logistic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistic.entity.StoreEntity;
import com.logistic.repository.IStoreRepository;

@Service
public class StoreService implements IStoreService {

    @Autowired
    IStoreRepository storeRepository;

    @Override
    public List<StoreEntity> getAll() {
        return storeRepository.findAll();
    }

    @Override
    public Optional<StoreEntity> getById(Integer id) {
        return storeRepository.findById(id);
    }

}