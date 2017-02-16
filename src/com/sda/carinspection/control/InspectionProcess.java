package com.sda.carinspection.control;

import com.sda.carinspecation.data.CarsRecord;
import com.sda.carinspspection.model.CreditCard;
import com.sda.carinspspection.model.QueueSystem;
import com.sda.carinspspection.model.Vehicle;

public class InspectionProcess {
	
	QueueSystem queueSystem = new QueueSystem();
	Vehicle vehicle = new Vehicle(1234);
	CarsRecord carDb = new CarsRecord();
	int licenseNumber = 8892345;
	Vehicle newVehicle;
	CreditCard creditcard= new CreditCard();
	PaymentSystem paymentSystem=new PaymentSystem();
	
	
	public void startNewInspection(){
		newCustomerQueueDisplay();
		returnVehicleInformation();
		int InspectionsCost=calculateVehicleInspectionsCost();
		payForInspections(InspectionsCost);
		
		
	}

	public void payForInspections(int InspectionsCost) {
		paymentSystem.requestAuthorization(creditcard,InspectionsCost);
	}

	public void newCustomerQueueDisplay() {
		queueSystem.incrementQueueNumber();
		queueSystem.displayCurrentNumber();
		
	}

	public int calculateVehicleInspectionsCost() {
		int totalCost=newVehicle.caluculateCost();
		return totalCost;
		
	}

	public void returnVehicleInformation() {
		newVehicle=checkVehicle(licenseNumber);
	}
	
	//Checks vehicle if exists if none adds it.
	public Vehicle checkVehicle(int licenseNumber) {
		if(carDb.searchVehicle(licenseNumber) !=null)
			return carDb.searchVehicle(licenseNumber);
		 carDb.addVehicle(licenseNumber,vehicle);
		 return carDb.searchVehicle(licenseNumber);
	}
	
	public void startInspections(){
		for (int i=0;i<newVehicle.getRequiredInspections().size();i++)
		{
			newVehicle.getRequiredInspections().get(i).getName();
			newVehicle.getRequiredInspections().get(i).setStatus(t);
		}
	}
}
