package com.logistic.service;

import java.util.List;
import java.util.Optional;

import com.logistic.entity.ProductsTypeEntity;

public interface IProductTypeService {

    List<ProductsTypeEntity> getAll();

    Optional<ProductsTypeEntity> getById(Integer id);

}