package com.apcfss.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.apcfss.RequestClasses.EmployeeRequest;
import com.apcfss.entities.EmployeeEntity;
import com.apcfss.repositories.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo emprepo;

	public List<EmployeeEntity> getEmpData() {
		return emprepo.findAll();
	}

	public ResponseEntity<String> postNewEmployee(EmployeeRequest empReq) {
		String message = "Failed to save";
		try {
			if (empReq != null) {
				EmployeeEntity emp = new EmployeeEntity();
				emp.setName(empReq.getName());
				emp.setAge(empReq.getAge());
				emp.setEmail(empReq.getEmail());
				emp.setLocation(empReq.getLocation());
				emp.setMobile(empReq.getMobile());
				emp.setSalary(empReq.getSalary());
				emp.setDistrict(empReq.getDistrict());
				emp.setSurname(empReq.getSurname());
				System.out.println("vinod" + emp.toString());
				emprepo.save(emp);
				message = "Successfully saved";
			}
			return ResponseEntity.ok().body(message);
		} catch (Exception e) {
			System.out.println("vinod");
			return ResponseEntity.ok().body(e.getMessage());
		}

	}

	public ResponseEntity<String> deleteEmployee(Integer id) {
		String message = "No User Found";
		if (id != null) {

			Optional<EmployeeEntity> now = emprepo.deleteEmp(id);
			System.out.println("dat" + now);
			if (now.isPresent()) {
				emprepo.delete(now.get());
				message = "Succesfully Deleted";
			}
		}
		return ResponseEntity.ok().body(message);
	}

	public ResponseEntity<String> UpdateEmp(Integer id, EmployeeRequest empReq) {
		String message = "Updation Failed";
		Optional<EmployeeEntity> dels = emprepo.deleteEmp(id);
		if (dels.isPresent()) {
			EmployeeEntity del = dels.get();
			del.setName(empReq.getName());
			del.setAge(empReq.getAge());
			del.setDistrict(empReq.getDistrict());
			del.setEmail(empReq.getEmail());
			del.setLocation(empReq.getLocation());
			del.setMobile(empReq.getMobile());
			del.setSalary(empReq.getSalary());
			del.setSurname(empReq.getSurname());
			System.out.println(del.toString());
			emprepo.save(del);
			message = "Successfully Updated";
			return ResponseEntity.ok().body(message);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
		}
	}
	
	public ResponseEntity<String> UpdateEmpNySno(EmployeeRequest empReq) {
		String message = "Updation Failed";
		Optional<EmployeeEntity> dels = emprepo.deleteEmp(empReq.getSno());
		if (dels.isPresent()) {
			EmployeeEntity del = dels.get();
			del.setName(empReq.getName());
			del.setAge(empReq.getAge());
			del.setDistrict(empReq.getDistrict());
			del.setEmail(empReq.getEmail());
			del.setLocation(empReq.getLocation());
			del.setMobile(empReq.getMobile());
			del.setSalary(empReq.getSalary());
			del.setSurname(empReq.getSurname());
			System.out.println(del.toString());
			emprepo.save(del);
			message = "Successfully Updated";
			return ResponseEntity.ok().body(message);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
		}
	}

}
