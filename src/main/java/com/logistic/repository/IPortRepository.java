package com.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistic.entity.PortEntity;

@Repository
public interface IPortRepository extends JpaRepository<PortEntity, Integer> { }