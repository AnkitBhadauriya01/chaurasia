package com.WttApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WttApi.Entity.MyEntity;

@Repository
public interface MyRepo extends JpaRepository<MyEntity, Integer> {

	Optional<MyEntity> findByName(String name);

	Optional<MyEntity> findByEmail(String email);

	void getMyEntityById(int id);

}
