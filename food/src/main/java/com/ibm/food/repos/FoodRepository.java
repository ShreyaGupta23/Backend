package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;



public interface FoodRepository extends JpaRepository<Restraunt, Integer>{

	Restraunt findByName(String name);
    Restraunt findById(int id);
	void deleteByName(String name);
}
