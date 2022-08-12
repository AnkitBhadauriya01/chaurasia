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

import com.demoApi.Entity.CourseEntity;
import com.demoApi.Service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@PostMapping("/creates")
	public CourseEntity createdata(@RequestBody CourseEntity a) {
		return courseService.createdata(a);
	}
	@GetMapping("/shows")
	public List<CourseEntity> datashow(){
		return courseService.datashow();
	}
	@GetMapping("/show/{id}")
	public Optional<CourseEntity> getById(@PathVariable int id){
		return courseService.getById(id);
	}
	@GetMapping("/show1/{coursefees}")
	public Optional<CourseEntity>getByCoursefees(@PathVariable int coursefees){
		return courseService.getByCoursefees(coursefees);
	}
	@GetMapping("/showd/{courseduration}")
	public Optional<CourseEntity>getByCourseduration(@PathVariable String courseduration){
		return courseService.getByCourseduration(courseduration);
	}
	@PutMapping("/updated/{id}")
	public CourseEntity updatedata (@RequestBody CourseEntity courseentity, @PathVariable int id) {
		return courseService.updatedata(courseentity,id);
	}
	@DeleteMapping("/deleted/{id}")
	public String deletedata(@PathVariable int id) {
		return courseService.deletedata(id);
	}
}
