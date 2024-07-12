package com.apcfss.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apcfss.RequestClasses.CrudRequest;
import com.apcfss.entities.CrudEntity;
import com.apcfss.services.CrudService;

@RestController
@RequestMapping("/crud")
public class CrudMain {
	
	@Autowired
	public CrudService userService;
	
	
	@GetMapping("/getData")
	public String getText() {
		return "Vinod Kumar";
	}
	
	@GetMapping("/getDatas")
	public ResponseEntity<String> helloResponse(){
		
		return ResponseEntity.ok().body("Success");
		
	}
	
	@GetMapping("/getData/{id}")
	public ResponseEntity<String> getOneData(@PathVariable Integer id){
		System.out.println("fdgdfg" + id);
		return ResponseEntity.ok().body("Success   :  " + id);
		
	}
	
	@PostMapping("/postData/{id}")
	public ResponseEntity<String> postData(@PathVariable int id , @RequestBody String mesage){
		return ResponseEntity.ok().body("ID is : "+ id + "Message iS :" + mesage);
	}
	
	@PostMapping("/postDataBasedOnId/{empid}")
	public ResponseEntity<CrudRequest> postDataBasesOnId(@PathVariable Integer empid, @RequestBody CrudRequest crudRequest){
		System.out.println(crudRequest.getName());
		return ResponseEntity.ok().body(crudRequest);
	}
	
	@GetMapping("/data")
	public ResponseEntity<String> getAllData(@RequestBody Integer id){
		System.out.println(id);
		return ResponseEntity.ok().body("success");
	}
	
	@GetMapping("/users")
    public List<CrudEntity> getAllUsers() {
        return userService.findAllUsers();
    }
	
	@PostMapping("/checkReqParam")
	public String getParams(@RequestParam String name, @RequestParam Integer age) {
		return "Name is : " + name + "  age is :  "+ age;
	}
	@GetMapping("/checkReqParam")
	public String getParamss(@RequestParam String name, @RequestParam Integer age) {
		return "Name is : " + name + "  age is :  "+ age;
	}

}
