package com.apcfss.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apcfss.RequestClasses.EmployeeRequest;
import com.apcfss.entities.EmployeeEntity;
import com.apcfss.services.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*")
public class EmloyeeController {

	@Autowired
	EmployeeService empServ;

	@GetMapping("/employeeData")
	public List<EmployeeEntity> getEmployees() {

		return empServ.getEmpData();
	}

	@PostMapping("/newEmploee")
	public ResponseEntity<String> addNewEmployee(@RequestBody EmployeeRequest empReq) {

		return empServ.postNewEmployee(empReq);

	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
		
		return empServ.deleteEmployee(id);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateData(@PathVariable Integer id, @RequestBody EmployeeRequest empReq){
		return empServ.UpdateEmp(id, empReq);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateData(@RequestBody EmployeeRequest empReq){
		return empServ.UpdateEmpNySno(empReq);
	}

}
