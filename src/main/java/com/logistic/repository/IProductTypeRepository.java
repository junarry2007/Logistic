package com.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistic.entity.ProductsTypeEntity;

@Repository
public interface IProductTypeRepository extends JpaRepository<ProductsTypeEntity, Integer> { }