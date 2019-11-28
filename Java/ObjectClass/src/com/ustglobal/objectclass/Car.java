package com.ustglobal.objectclass;

public class Car {
	
	int cost;
	String color;
	String name;
	public Car(int cost, String color, String name) 
	{
		super();
		this.cost = cost;
		this.color = color;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return cost;
	}

	@Override
	public String toString() {
		return "Car cost is " + cost + ", color is " + color + ", name is " + name ;
	}
	
	
}
