package com.logistic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistic.entity.ProductsTypeEntity;
import com.logistic.repository.IProductTypeRepository; 

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    IProductTypeRepository productTypeRepository;

    @Override
    public List<ProductsTypeEntity> getAll() {
        return productTypeRepository.findAll();
    }

    @Override
    public Optional<ProductsTypeEntity> getById(Integer id) {
        return productTypeRepository.findById(id);
    }

}