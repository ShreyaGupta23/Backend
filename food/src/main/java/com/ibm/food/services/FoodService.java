package com.ibm.food.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.food.entities.Donate;
import com.ibm.food.entities.Order_Receipt;
import com.ibm.food.entities.Restaurants;
import com.ibm.food.repos.*;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FoodService {

	@Autowired
	FoodRepository foodRepository;
	
	@Autowired
	DonateRepository donateRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
//POST AND GET METHODS OF RESTRAUNTS
	public Restaurants addRestaurant(Restaurants restaurant) {
		return foodRepository.save(restaurant);
		
	}
	public List<Restaurants> findAllRestaurant() {
		List<Restaurants> restaurants=foodRepository.findAll();
		System.out.println(restaurants);
		return restaurants;
	}
	public Restaurants findRestaurantByName(String name) {
		return foodRepository.findByName(name);
	}
	public Restaurants findRestaurantById(int id) {
		return foodRepository.findById(id);
	}
	
	//UPDATE METHODS FOR RESTRAUNT	
	@Transactional
	public void updateRestaurant(Restaurants updatedRestaurant) {
		Restaurants restaurant = foodRepository.findById(updatedRestaurant.getId());
		restaurant.setName(updatedRestaurant.getName());
		restaurant.setType(updatedRestaurant.getType());
		restaurant.setLocation(updatedRestaurant.getLocation());
		restaurant.setContact(updatedRestaurant.getContact());
		restaurant.setAccessed(updatedRestaurant.getAccessed());
		restaurant.setAvailable(updatedRestaurant.getAvailable());
		restaurant.setImage(updatedRestaurant.getImage());
		restaurant.setDishes(updatedRestaurant.getDishes());
	}
	
//DELETE METHODS FOR RESTRAUNT
	public void deleteRestaurantById(int id) {
		foodRepository.deleteById(id);
		
	}
	public void deleteRestaurantByName(String name) {
		foodRepository.deleteByName(name);
		
	}
//DELETE METHOD FOR DISHES
//POST AND GET METHODS FOR ORDER
	public Order_Receipt addOrder(Order_Receipt order) {
		return orderRepository.save(order);
		
	}
	public List<Order_Receipt> findAllOrder() {
		List<Order_Receipt> orders=orderRepository.findAll();
		System.out.println(orders);
		return orders;
	}
	//POST AND GET METHODS FOR DONATE
	public Donate addDonate(Donate donate) {
return donateRepository.save(donate);
		
	}
	public List<Donate> findAllDonate() {
	List<Donate> donation=donateRepository.findAll();
		System.out.println(donation);
		return donation;
	}

}
