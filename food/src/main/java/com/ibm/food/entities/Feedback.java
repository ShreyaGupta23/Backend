package com.ibm.food.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	String name;
	String comments;
	int rating;
	public Feedback() {
		super();
	}
	public Feedback(int id, String name, String comments, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.comments = comments;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", comments=" + comments + ", rating=" + rating + "]";
	}
	

}
