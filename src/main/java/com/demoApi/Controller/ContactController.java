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

import com.demoApi.Entity.Contact;
import com.demoApi.Service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/generate")
	public Contact createdata(@RequestBody Contact d) {
		return contactService.createdata(d);
	}
	@GetMapping("/face")
	public List<Contact> facedata(){
		return contactService.facedata();
	}
	@GetMapping("/face1/{id}")
	public Optional<Contact> getById(@PathVariable int id){
		return contactService.getById(id);
	}
	@GetMapping("/face2/{email}")
	public List<Contact> getByEmail(@PathVariable String email){
		return contactService.getByEmail(email);
	}
	@GetMapping("/face3/{phoneno}")
	public List<Contact> getByPhoneno(@PathVariable int phoneno){
		return contactService.getByPhoneno(phoneno);
	}
	@PutMapping("/updated3/{id}")
	public Contact dataupdate(@RequestBody Contact contact,@PathVariable int id) {
		return contactService.dataupdate(contact,id);
	}
	@DeleteMapping("/detet/{id}")
	public String datadelete(@PathVariable int id) {
		return contactService.datadelete(id);
	}

}
