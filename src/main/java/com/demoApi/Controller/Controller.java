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

import com.demoApi.Entity.Cart;
import com.demoApi.Service.CartService;

@RestController
public class Controller {

	@Autowired
	CartService cartService;
	
	@PostMapping("/createss")
	public Cart createdata(@RequestBody Cart a) {
		return cartService.createdata(a);
	}
	@GetMapping("/sho")
	public List<Cart> datashow(){
		return cartService.datashow();
	}
	@GetMapping("/sho1/{id}")
	public Optional<Cart> getById(@PathVariable int id){
	return cartService.getById(id);
	}
	@GetMapping("/sho2/{price}")
	public Optional<Cart> getByPrice(@PathVariable double price){
		return cartService.getByPrice(price);
	}
	@GetMapping("/sho/{deliveryTime}")
	public Optional<Cart> getByDeliveryTime(@PathVariable String deliveryTime){
		return cartService.getByDeliveryTime(deliveryTime);
	}
	@GetMapping("/sho3/{favourite}")
	public Optional<Cart> getByFavourite(@PathVariable String favourite){
		return cartService.getByFavourite(favourite);
	}
	@PutMapping("/updated2/{id}")
	public Cart updatedata(@RequestBody Cart cart,@PathVariable int id) {
		return cartService.updatedata( cart,id);
	}
	@DeleteMapping("/deleteing/{id}")
	public String deletedata(@PathVariable int id) {
		return cartService.deletedata(id);
	}
}
