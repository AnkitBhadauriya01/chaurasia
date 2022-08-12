package com.demoApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoApi.Entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	Optional<Admin> findByEmail(String email);

	Optional<Admin> findByPassword(String password);

	void getAdminEntityById(int id);

}
