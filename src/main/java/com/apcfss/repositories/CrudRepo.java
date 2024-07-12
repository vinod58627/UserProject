package com.apcfss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apcfss.entities.CrudEntity;


@Repository
public interface CrudRepo extends JpaRepository<CrudEntity, Integer> {
    // Integer should match the primary key type in the CrudEntity class
}
