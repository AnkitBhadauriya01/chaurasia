package com.demoApi;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demoApi.Entity.Admin;
import com.demoApi.Entity.Cart;
import com.demoApi.Entity.Contact;
import com.demoApi.Entity.CourseEntity;
import com.demoApi.Entity.MyEntity;
import com.demoApi.Entity.Users;
import com.demoApi.Repository.AdminRepo;
import com.demoApi.Repository.CartRepo;
import com.demoApi.Repository.ContactRepo;
import com.demoApi.Repository.CourseRepo;
import com.demoApi.Repository.MyRepo;


@SpringBootTest
class DemoApiApplicationTests {
	

    @Autowired
    AdminRepo adminRepo;
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    MyRepo myRepo;
    @Autowired
    CartRepo cartRepo;
    @Autowired
    ContactRepo contactRepo;
   
    
    @Test
    public void testcreatAdmin()
    {
        Admin a = new Admin();
        a.setEmail("mohit465@gmail.com");
        a.setId(6);
        a.setPassword("mohit@123");
    }
    
    @Test
    public void testAllAdmin()
    {
        Admin a = new Admin();
        a.getEmail();
        a.getId();
        a.getPassword();
        assertNotEquals(null, adminRepo.findAll());
    }

	@Test
	public void testAllCourseEntity() {
		CourseEntity c = new CourseEntity();
		c.getId();
		c.getCoursename();
		c.getCoursefees();
		c.getCourseduration();
		c.getCoursedescription();
	}
	
	@Test
	public void testcreateCourseEntity() {
		CourseEntity c = new CourseEntity();
		c.setId(2);
		c.setCoursename("core-java");
		c.setCoursefees(5000);
		c.setCourseduration("3-month");
		c.setCoursedescription("skills and knowledge to be learned");
	}
	
	@Test
	public void testAllMyEntity() {
		MyEntity d = new MyEntity();
		d.getId();
		d.getStudentname();
		d.getStudentemail();
		d.getStudentmobileno();
		d.getStudentaddress();
		d.getStudentcity();
		
	}
	
	@Test
	public void testcreateMyEntity() {
		MyEntity d = new MyEntity();
		d.setId(1);
		d.setStudentname("Ankit");
		d.setStudentemail("ankit645@gmail.com");
		d.setStudentmobileno("978657657");
		d.setStudentaddress("Rambagh");
		d.setStudentcity("Agra");
	}
	@Test
	public void testAllCart() {
		Cart e = new Cart();
		e.getId();
		e.getTitle();
		e.getPrice();
		e.getQuantity();
		e.getDeliveryTime();
		e.getStars();
		e.getImg();
	}
	@Test
	public void testcreateCart() {
		Cart e = new Cart();
		e.setId(8);
		e.setTitle("core-java");
		e.setPrice(5000);
		e.setQuantity(2);
		e.setDeliveryTime("All time");
		e.setStars(5);
		e.setImg("http://media3training.com/wp-content/uploads/2019/03/corejava.jpg");
	}
	@Test
	public void testAllContact() {
		Contact d = new Contact();
		d.getName();
		d.getEmail();
		d.getPhoneno();
		d.getQuery();
	}
	@Test
	public void testcreateContact() {
		Contact d = new Contact();
		d.setName("walkingtree");
		d.setEmail("walkin#@gmail.com");
		d.setPhoneno(15);
		d.setQuery("A query definition is a Java runtime object (similar to a factory class). Creating a query definition is a separate step from opening and executing a query statement");
	}
	@Test
	public void testAllUsers() {
		Users f = new Users ();
		f.getId();
		f.getName();
		f.getEmail();
		f.getPassword();
	}
	@Test
	public void testcreateUsers() {
		Users f = new Users();
		f.setId(20);
		f.setName("Ankit");
		f.setEmail("ankit76@gmail.com");
		f.setPassword("ankit@123");
	}

}
