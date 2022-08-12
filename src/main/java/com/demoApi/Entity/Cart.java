package com.demoApi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
    public String title;
    double price;
    int quantity;
    String deliveryTime;
    String favourite;
    int stars;
    String img;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getFavourite() {
		return favourite;
	}
	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int id, String title, double price, int quantity, String deliveryTime, String favourite, int stars,
			String img) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
		this.deliveryTime = deliveryTime;
		this.favourite = favourite;
		this.stars = stars;
		this.img = img;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", title=" + title + ", price=" + price + ", quantity=" + quantity + ", deliveryTime="
				+ deliveryTime + ", favourite=" + favourite + ", stars=" + stars + ", img=" + img + "]";
	}
    
    
}
