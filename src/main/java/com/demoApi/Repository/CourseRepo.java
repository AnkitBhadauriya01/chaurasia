package com.demoApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoApi.Entity.CourseEntity;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

	Optional<CourseEntity> findByCoursefees(int coursefees);

	Optional<CourseEntity> findByCourseduration(String courseduration);

	void getCourseEntityById(int id);
	
}
