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
	@PostMapping("/restraunt")
	public ResponseEntity<Void> addRestraunt(@RequestBody Restraunt restraunt) {
		foodService.addRestraunt(restraunt);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
}

	@GetMapping("/restraunt")
	public List<Restraunt> findAllRestraunt(){
		return foodService.findAllRestraunt();
	}
	
	@GetMapping("/restraunt/{name}")
	public Restraunt findRestrauntByName(@PathVariable("name") String name){
		return foodService.findRestrauntByName(name);
	}
	@GetMapping("/restraunt/{id}")
	public Restraunt findRestrauntById(@PathVariable("id") int id){

		Restraunt restraunt = foodService.findRestrauntById(id);
		return restraunt;
	}

//UPDATE MAPPING FOR RESTRAUNT
	@PutMapping("/updateRestraunt")
public ResponseEntity<Void> updateRestraunt(@RequestBody Restraunt restraunt){
		foodService.updateRestraunt(restraunt);
	ResponseEntity<Void> re = new ResponseEntity<>(HttpStatus.ACCEPTED);
	return re;
	}
//DELETE MAPPING FOR RESTRAUNT
	@RequestMapping(path="/restraunt/{id}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id){
		ResponseEntity<Void> re= null;
		try{
			foodService.deleteRestrauntById(id);
			re = new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
	
	@RequestMapping(path="/restraunt/{name}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("name") String name){
		ResponseEntity<Void> re= null;
		try{
			foodService.deleteRestrauntByName(name);
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
	public ResponseEntity<Void> addOrder(@RequestBody Order order) {
		foodService.addOrder(order);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;
}

	@GetMapping("/order")
	public List<Order> findAllOrder(){
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
