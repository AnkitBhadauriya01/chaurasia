package com.demoApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Entity.Cart;
import com.demoApi.Repository.CartRepo;

@Service
public class CartService {
	
	@Autowired
	CartRepo cartRepo;

	public Cart createdata(Cart a) {
		// TODO Auto-generated method stub
		return cartRepo.save(a);
	}

	public List<Cart> datashow() {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

	public Optional<Cart> getById(int id) {
		// TODO Auto-generated method stub
		return cartRepo.findById(id);
	}

	public Optional<Cart> getByPrice(double price) {
		// TODO Auto-generated method stub
		return cartRepo.findByPrice(price);
	}

	public Optional<Cart> getByDeliveryTime(String deliveryTime) {
		// TODO Auto-generated method stub
		return cartRepo.findByDeliveryTime(deliveryTime);
	}

	public Optional<Cart> getByFavourite(String favourite) {
		// TODO Auto-generated method stub
		return cartRepo.findByFavourite(favourite);
	}

	public Cart updatedata(Cart cart, int id) {
		// TODO Auto-generated method stub
		return cartRepo.save(cart);
	}

	public String deletedata(int id) {
		// TODO Auto-generated method stub
		 cartRepo.deleteById(id);
		 return "Deleted";
	}

	
}
