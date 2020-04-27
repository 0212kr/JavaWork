package com.lec.java.oop03;

public class HybridCar extends Car {

	private int electricity;

	public int getElectricity() {
		return electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("--- HybridCar ---");
		System.out.println("speed "+getSpeed()+" oil "+getOil()+" electricity : "+electricity);
	}
	
}
