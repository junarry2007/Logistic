package com.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistic.entity.StoreEntity;

@Repository
public interface IStoreRepository extends JpaRepository<StoreEntity, Integer> { }