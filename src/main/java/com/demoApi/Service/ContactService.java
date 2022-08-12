package com.demoApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Entity.Contact;
import com.demoApi.Repository.ContactRepo;

@Service
public class ContactService{
	
	@Autowired
	ContactRepo contactRepo;
    
	public Contact createdata(Contact d) {
		// TODO Auto-generated method stub
		return contactRepo.save(d);
	}

	public List<Contact> facedata() {
		// TODO Auto-generated method stub
		return contactRepo.findAll();
	}

	public Optional<Contact> getById(int id) {
		// TODO Auto-generated method stub
		return contactRepo.findById(id);
	}

	public List<Contact> getByEmail(String email) {
		// TODO Auto-generated method stub
		return contactRepo.findByEmail(email);
	}

	public List<Contact> getByPhoneno(int phoneno) {
		// TODO Auto-generated method stub
		return contactRepo.findByPhoneno(phoneno);
	}

	public Contact dataupdate(Contact contact, int id) {
		// TODO Auto-generated method stub
		return contactRepo.save(contact);
	}

	public String datadelete(int id) {
		// TODO Auto-generated method stub
		 contactRepo.deleteById(id);
		 return "Deleted";
	}
	

}
