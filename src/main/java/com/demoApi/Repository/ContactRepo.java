package com.demoApi.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demoApi.Entity.Contact;


@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer>{

	List<Contact> findByEmail(String email);

	List<Contact> findByPhoneno(int phoneno);



}
