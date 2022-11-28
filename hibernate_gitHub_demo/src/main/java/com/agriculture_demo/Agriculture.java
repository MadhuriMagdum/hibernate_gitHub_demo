package com.agriculture_demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agriculture {
	@Id
   private int id;
   private String plant_name;
   private  String colour;
   private double price;
public Agriculture() {
	super();
	// TODO Auto-generated constructor stub
}
public Agriculture(int id, String plant_name, String colour, double price) {
	super();
	this.id = id;
	this.plant_name = plant_name;
	this.colour = colour;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPlant_name() {
	return plant_name;
}
public void setPlant_name(String plant_name) {
	this.plant_name = plant_name;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Agriculture [id=" + id + ", plant_name=" + plant_name + ", colour=" + colour + ", price=" + price + "]";
}
   
  

}
