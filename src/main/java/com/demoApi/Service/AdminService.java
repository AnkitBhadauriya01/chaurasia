package com.demoApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Entity.Admin;
import com.demoApi.Repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;

	public Admin createdata(Admin a) {
		// TODO Auto-generated method stub
		return adminRepo.save(a);
	}

	public List<Admin> showdata() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	public Optional<Admin> getByEmail(String email) {
		// TODO Auto-generated method stub
		return adminRepo.findByEmail(email);
	}

	public Optional<Admin> getByPassword(String password) {
		// TODO Auto-generated method stub
		return adminRepo.findByPassword(password);
	}

	public Admin updatedata(Admin admin, int id) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	public String deletedata(int id) {
		// TODO Auto-generated method stub
		 adminRepo.deleteById(id);
		 return "Deleted";
	}
	

}
