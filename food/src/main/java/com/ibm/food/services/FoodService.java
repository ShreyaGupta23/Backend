package com.ibm.food.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.food.entities.Donate;
import com.ibm.food.entities.Order;
import com.ibm.food.entities.Restraunt;
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
	public Restraunt addRestraunt(Restraunt restraunt) {
		return foodRepository.save(restraunt);
		
	}
	public List<Restraunt> findAllRestraunt() {
		List<Restraunt> restraunts=foodRepository.findAll();
		System.out.println(restraunts);
		return restraunts;
	}
	public Restraunt findRestrauntByName(String name) {
		return foodRepository.findByName(name);
	}
	public Restraunt findRestrauntById(int id) {
		return foodRepository.findById(id);
	}
	
	//UPDATE METHODS FOR RESTRAUNT	
	@Transactional
	public void updateRestraunt(Restraunt updatedRestraunt) {
		Restraunt restraunt = foodRepository.findById(updatedRestraunt.getId());
		restraunt.setName(updatedRestraunt.getName());
		restraunt.setType(updatedRestraunt.getType());
		restraunt.setLocation(updatedRestraunt.getLocation());
		restraunt.setContact(updatedRestraunt.getContact());
		restraunt.setAccessed(updatedRestraunt.getAccessed());
		restraunt.setAvailable(updatedRestraunt.getAvailable());
		restraunt.setImage(updatedRestraunt.getImage());
		restraunt.setDishes(updatedRestraunt.getDishes());
	}
	
//DELETE METHODS FOR RESTRAUNT
	public void deleteRestrauntById(int id) {
		foodRepository.deleteById(id);
		
	}
	public void deleteRestrauntByName(String name) {
		foodRepository.deleteByName(name);
		
	}
//DELETE METHOD FOR DISHES
//POST AND GET METHODS FOR ORDER
	public Order addOrder(Order order) {
		return orderRepository.save(order);
		
	}
	public List<Order> findAllOrder() {
		List<Order> orders=orderRepository.findAll();
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
