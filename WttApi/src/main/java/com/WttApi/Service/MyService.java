package com.WttApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.WttApi.Entity.MyEntity;
import com.WttApi.Repository.MyRepo;

@Service
public class MyService {
	
	@Autowired
	MyRepo myrepo;

	public MyEntity createdata(MyEntity a) {
		// TODO Auto-generated method stub
		return myrepo.save(a);
	}

	public List<MyEntity> datashow() {
		// TODO Auto-generated method stub
		return myrepo.findAll();
	}

	public Optional<MyEntity> getMyEntityById(int id) {
		// TODO Auto-generated method stub
		return myrepo.findById(id);
	}

	public Optional<MyEntity> getMyEntityByName(String name) {
		// TODO Auto-generated method stub
		return myrepo.findByName(name);
	}

	public Optional<MyEntity> getMyEntityByEmail(String email) {
		// TODO Auto-generated method stub
		return myrepo.findByEmail(email);
	}

	public MyEntity dataupdate(MyEntity myEntity, int id) {
		// TODO Auto-generated method stub
		 myrepo.getMyEntityById(id);
		 return myrepo.save(myEntity);
	}

	public String deletedata(int id) {
		// TODO Auto-generated method stub
		 myrepo.deleteById(id);
		 return "Deleted";
	}

	

}
