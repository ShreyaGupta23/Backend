package com.ibm.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.food.entities.*;
import com.ibm.food.services.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class FoodController {

	@Autowired
	FoodService foodService;
	
//POST AND GET MAPPING OF RESTRAUNT	
	@PostMapping("/restaurant")
	public ResponseEntity<Void> addRestaurant(@RequestBody Restaurants restaurant) {
		foodService.addRestaurant(restaurant);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
}

	@GetMapping("/restaurant")
	public List<Restaurants> findAllRestaurant(){
		return foodService.findAllRestaurant();
	}
	
	@GetMapping("/restaurant/name/{name}")
	public List<Restaurants> findRestaurantByName(@PathVariable("name") String name){
		return foodService.findRestaurantByName(name);
	}
	@GetMapping("/restaurant/id/{id}")
	public Restaurants findRestaurantById(@PathVariable("id") int id){

		Restaurants restaurant = foodService.findRestaurantById(id);
		return restaurant;
	}
	
	@GetMapping("/restaurant/location/{location}")
	public List<Restaurants> findRestaurantByLocation(@PathVariable("location") String location){

		List<Restaurants> restaurant = foodService.findRestaurantByLocation(location);
		return restaurant;
	}

//UPDATE MAPPING FOR RESTRAUNT
	@PutMapping("/updateRestaurant")
public ResponseEntity<Void> updateRestaurant(@RequestBody Restaurants restaurant){
		foodService.updateRestaurant(restaurant);
	ResponseEntity<Void> re = new ResponseEntity<>(HttpStatus.ACCEPTED);
	return re;
	}
//DELETE MAPPING FOR RESTRAUNT
	@RequestMapping(path="/restaurant/{id}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteRestaurant(@PathVariable("id") int id){
		ResponseEntity<Void> re= null;
		try{
			foodService.deleteRestaurantById(id);
			re = new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
	
	@RequestMapping(path="/restaurant/{name}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteResturant(@PathVariable("name") String name){
		ResponseEntity<Void> re= null;
		try{
			foodService.deleteRestaurantByName(name);
			re = new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
		}
//DELETE MAPPING FOR DISHES
//POST AND GET MAPPING FOR ORDER
	@PostMapping("/order")
	public ResponseEntity<Void> addOrder(@RequestBody Order_Receipt order) {
		foodService.addOrder(order);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
}

	@GetMapping("/order")
	public List<Order_Receipt> findAllOrder(){
		return foodService.findAllOrder();
	}
	//POST AND GET MAPPING FOR DONATE
	@PostMapping("/donate")
	public ResponseEntity<Void> addDonate(@RequestBody Donate donate) {
		foodService.addDonate(donate);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
}

	@GetMapping("/donate")
	public List<Donate> findAllDonate(){
		return foodService.findAllDonate();
	}
}
