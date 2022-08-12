package com.demoApi.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Entity.Users;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;

	public Users createdata(Users a) {
		// TODO Auto-generated method stub
		return userRepo.save(a);
	}

	public List<Users> datashow() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public Optional<Users> getById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	public Optional<Users> getByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(email);
	}

	public Optional<Users> getByPassword(String password) {
		// TODO Auto-generated method stub
		return userRepo.findByPassword(password);
	}

	public Users updatedata(Users users, int id) {
		// TODO Auto-generated method stub
		return userRepo.save(users);
	}

	public String deletedata(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		return "Deleted";
	}
	

}
