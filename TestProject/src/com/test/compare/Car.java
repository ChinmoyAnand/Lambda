package com.test.compare;

public class Car implements Comparable<Car>{
	
	private int price;
	private String name;
	private int modelYear;
	
	
	
	
	public Car(int price, String name, int modelYear) {
		super();
		this.price = price;
		this.name = name;
		this.modelYear = modelYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", modelYear=" + modelYear + "]";
	}
	@Override
	public int compareTo(Car car2) {
		if(this.getPrice()> car2.getPrice())
			return 12;
		else 
			return -1;
	}
	
	

}
