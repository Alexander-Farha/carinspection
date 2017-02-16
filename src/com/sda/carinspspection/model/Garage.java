package com.sda.carinspspection.model;

public class Garage {
	public boolean doorOpened;
	
	public Garage() {
		doorOpened=false;
	}
		
	public void openDoor() {
		System.out.println("Door is open");
		doorOpened=true;
		
	}
	
	public void closeDoor() {
		System.out.println("Door is closed");
		doorOpened=false;
		
	}
}
