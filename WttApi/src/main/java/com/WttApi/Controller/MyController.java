package com.WttApi.Controller;

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

import com.WttApi.Entity.MyEntity;
import com.WttApi.Service.MyService;

@RestController
public class MyController {

	@Autowired
	MyService myService;
	
	@GetMapping("/")
	public String home() {
	return "home";
	}
	
	@PostMapping("/create")
	public MyEntity createdata(@RequestBody MyEntity a) {
		return myService.createdata(a);
	}
	@GetMapping("/show")
	public List<MyEntity> datashow(){
		return myService.datashow();
	}
	@GetMapping("/show/{id}")
	public Optional<MyEntity> getById(@PathVariable int id){
		return myService.getMyEntityById(id);
	}
	@GetMapping("show/{name}")
	public Optional<MyEntity> getByName(@PathVariable String name){
		return myService.getMyEntityByName(name);
	}
	@GetMapping("show/{email}")
	public Optional<MyEntity> getByEmail(@PathVariable String email){
		return myService.getMyEntityByEmail(email);
	}
	
	@PutMapping("/update{id}")
	public MyEntity dataupdate(@RequestBody MyEntity myEntity, @PathVariable int id) {
		return myService.dataupdate(myEntity,id);
	}
	@DeleteMapping("/deleted/{id}")
	public String deletedata(@PathVariable int id) {
		return myService.deletedata(id);
	}
}
