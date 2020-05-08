package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;



public interface FoodRepository extends JpaRepository<Restaurants, Integer>{

	Restaurants findByName(String name);
    Restaurants findById(int id);
	void deleteByName(String name);
}
