package com.demoApi.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoApi.Entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

	Optional<Cart> findByPrice(double price);

	Optional<Cart> findByDeliveryTime(String deliveryTime);

	Optional<Cart> findByFavourite(String favourite);

}
