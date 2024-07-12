package com.apcfss.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.apcfss.entities.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

	@Query(value = "select * from user where id = :id" ,  nativeQuery = true)
	Optional<EmployeeEntity> deleteEmp(Integer id);

}
