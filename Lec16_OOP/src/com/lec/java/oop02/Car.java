package com.lec.java.oop02;

public class Car extends Vehicle {
	
	private int oil;

	public int getOil() {
		return oil;
	}

	public void setOil(int oiS) {
		this.oil = oil;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("--- Car 정보 ---");
		System.out.println("speed : "+getSpeed()+" oil : "+oil);
	}
	
}
