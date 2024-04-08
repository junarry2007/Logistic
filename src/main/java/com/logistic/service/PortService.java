package com.logistic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistic.entity.PortEntity;
import com.logistic.repository.IPortRepository;

@Service
public class PortService implements IPortService {

    @Autowired
    IPortRepository portRepository;

    @Override
    public List<PortEntity> getAll() {
        return portRepository.findAll();
    }

    @Override
    public Optional<PortEntity> getById(Integer id) {
        return portRepository.findById(id);
    }

}