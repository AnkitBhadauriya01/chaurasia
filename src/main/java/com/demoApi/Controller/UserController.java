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

import com.demoApi.Entity.Users;
import com.demoApi.Repository.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/creator")
	public Users createdata(@RequestBody Users a) {
		return userService.createdata(a);
	}
	@GetMapping("/look")
	public List<Users> datashow(){
		return userService.datashow();
	}
	@GetMapping("/look1/{id}")
	public Optional<Users>getById(@PathVariable int id){
		return userService.getById(id);
	}
	@GetMapping("/look2/{email}")
	public Optional<Users> getByEmail(@PathVariable String email){
		return userService.getByEmail(email);
	}
	@GetMapping("/look3/{password}")
	public Optional<Users> getByPassword(@PathVariable String password){
		return userService.getByPassword(password);
	}
	@PutMapping("/updater/{id}")
	public Users updatedate(@RequestBody Users users,@PathVariable int id) {
		return userService.updatedata(users,id);
	}
	@DeleteMapping("/deletor/{id}")
	public String deletedata(@PathVariable int id) {
		return userService.deletedata(id);
	}

}
