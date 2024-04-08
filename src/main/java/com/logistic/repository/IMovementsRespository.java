package com.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistic.entity.MovementsEntity;

@Repository
public interface IMovementsRespository extends JpaRepository<MovementsEntity, Integer> { }