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

import com.demoApi.Entity.Admin;
import com.demoApi.Service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/create1")
	public Admin createdata(@RequestBody Admin a) {
		return adminService.createdata(a);
	}
	@GetMapping("/showing")
	public List<Admin> showdata(){
		return adminService.showdata();
	}
	@GetMapping("/shows1/{email}")
	public Optional<Admin> getByEmail(@PathVariable String email){
		return adminService.getByEmail(email);
	}
	@GetMapping("/shows2/{password}")
	public Optional<Admin> getByPassword(@PathVariable String password){
		return adminService.getByPassword(password);
	}
	@PutMapping("/updated1/{id}")
	public Admin updatedata(@RequestBody Admin admin,@PathVariable int id) {
		return adminService.updatedata(admin,id);
	}
	@DeleteMapping("/delete1")
	public String deletedata(@PathVariable int id) {
		return adminService.deletedata(id);
	}
	

}
