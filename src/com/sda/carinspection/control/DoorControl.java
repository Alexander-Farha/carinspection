package com.sda.carinspection.control;

import com.sda.carinspspection.model.Garage;

public class DoorControl {
	Garage garage =new Garage();
	
	public void doorSwitchOn(){
	garage.openDoor();
	}
	public void doorSwitchOff(){
		garage.closeDoor();
		}
}
