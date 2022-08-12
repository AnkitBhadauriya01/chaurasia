package com.demoApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Entity.MyEntity;
import com.demoApi.Repository.MyRepo;

@Service
public class MyService {
	
	@Autowired
	MyRepo myRepo;

	public MyEntity createdata(MyEntity a) {
		// TODO Auto-generated method stub
		return myRepo.save(a);
	}

	public List<MyEntity> creates() {
		// TODO Auto-generated method stub
		return myRepo.findAll();
	}

	public Optional<MyEntity> getById(int id) {
		// TODO Auto-generated method stub
		return myRepo.findById(id);
	}

	public Optional<MyEntity> getByStudentemail(String Studentemail) {
		// TODO Auto-generated method stub
		return myRepo.findByStudentemail(Studentemail);
	}

	public Optional<MyEntity> getByStudentmobileno(String studentmobileno) {
		// TODO Auto-generated method stub
		return myRepo.findByStudentmobileno(studentmobileno);
	}

	public Optional<MyEntity> getByStudentaddress(String studentaddress) {
		// TODO Auto-generated method stub
		return myRepo.findByStudentaddress(studentaddress);
	}

	
	public String deletedata(int id) {
		// TODO Auto-generated method stub
		 myRepo.deleteById(id);
		 return "Deleted";
	}

	public MyEntity entityupdate(MyEntity myentity, int id) {
		// TODO Auto-generated method stub
		return myRepo.save(myentity);
	}

}
