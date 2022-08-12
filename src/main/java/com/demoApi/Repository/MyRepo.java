package com.demoApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoApi.Entity.MyEntity;

@Repository
public interface MyRepo extends JpaRepository<MyEntity,Integer> {

	Optional<MyEntity> findByStudentemail(String studentemail);

	Optional<MyEntity> findByStudentmobileno(String studentmobileno);

	Optional<MyEntity> findByStudentaddress(String studentaddress);

	



}
