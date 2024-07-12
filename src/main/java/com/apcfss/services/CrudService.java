package com.apcfss.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apcfss.entities.CrudEntity;
import com.apcfss.repositories.CrudRepo;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    private CrudRepo userRepository;

    public List<CrudEntity> findAllUsers() {
        return userRepository.findAll();
    }

  
}

