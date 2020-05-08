package com.ibm.food.entities;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Donate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String helper;
	String location;
	String description;
	String contact;
	String email;
	
	@Lob
	Blob image_logo;

	public Donate() {
		super();
		
	}

	public Donate(int id, String helper, String location, String description, String contact, String email,
			Blob image_logo) {
		super();
		this.id = id;
		this.helper = helper;
		this.location = location;
		this.description = description;
		this.contact = contact;
		this.email = email;
		this.image_logo = image_logo;
	}

	public String getHelper() {
		return helper;
	}

	public void setHelper(String helper) {
		this.helper = helper;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Blob getImage_logo() {
		return image_logo;
	}

	public void setImage_logo(Blob image_logo) {
		this.image_logo = image_logo;
	}

	@Override
	public String toString() {
		return "Donate [id=" + id + ", helper=" + helper + ", location=" + location + ", description=" + description
				+ ", contact=" + contact + ", email=" + email + ", image_logo=" + image_logo + "]";
	}
	
	

}
