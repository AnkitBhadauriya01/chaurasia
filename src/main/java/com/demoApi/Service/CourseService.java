package com.demoApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Entity.CourseEntity;
import com.demoApi.Repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;

	public CourseEntity createdata(CourseEntity a) {
		// TODO Auto-generated method stub
		return courseRepo.save(a);
	}

	public List<CourseEntity> datashow() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	public Optional<CourseEntity> getById(int id) {
		// TODO Auto-generated method stub
		return courseRepo.findById(id);
	}

	public Optional<CourseEntity> getByCoursefees(int coursefees) {
		// TODO Auto-generated method stub
		return courseRepo.findByCoursefees(coursefees);
	}

	public Optional<CourseEntity> getByCourseduration(String courseduration) {
		// TODO Auto-generated method stub
		return courseRepo.findByCourseduration(courseduration);
	}

	public CourseEntity updatedata(CourseEntity courseentity, int id) {
		// TODO Auto-generated method stub
		return courseRepo.save(courseentity);
	}

	public String deletedata(int id) {
		// TODO Auto-generated method stub
		courseRepo.deleteById(id);
		return "Deleted";
	}

}
