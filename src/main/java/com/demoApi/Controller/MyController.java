package com.demoApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoApi.Entity.MyEntity;
import com.demoApi.Service.MyService;

@RestController
public class MyController {

	@Autowired
	MyService myService;
	
	@PostMapping("/create")
	public MyEntity createdata(@RequestBody MyEntity a) {
		return myService.createdata(a);
	}
	
	@GetMapping("/creates")
	public List<MyEntity> creates(){
		return myService.creates();
	}
	@GetMapping("/creates/{id}")
	public Optional<MyEntity> getById(@PathVariable int id){
		return myService.getById(id);
	}
	@GetMapping("/createsk/{Studentemail}")
	public Optional<MyEntity> getByStudentEmail(@PathVariable String Studentemail){
		return myService.getByStudentemail(Studentemail);
	}
	@GetMapping("/creates1/{studentmobileno}")
	public Optional<MyEntity> getByStudentmobileno(@PathVariable String studentmobileno){
		return myService.getByStudentmobileno(studentmobileno);
	}
	@GetMapping("/creates2/{address}")
	public Optional<MyEntity> getByStudentaddress(@PathVariable String studentaddress){
		return myService.getByStudentaddress(studentaddress);
	}
	
	@PutMapping("/updates/{id}")
	public MyEntity entitydata(@RequestBody MyEntity myentity, @PathVariable int id) {
		return myService.entityupdate(myentity,id);
	}
	@DeleteMapping("/creates/{id}")
	public String deletedata(@PathVariable int id) {
		return myService.deletedata(id);
	}
}
