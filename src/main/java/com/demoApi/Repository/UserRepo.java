package com.demoApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoApi.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	Optional<Users> findById(int id);

	Optional<Users> findByEmail(String email);

	Optional<Users> findByPassword(String password);


}
