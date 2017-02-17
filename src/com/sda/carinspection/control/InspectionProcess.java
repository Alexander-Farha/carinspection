package com.sda.carinspection.control;

import com.sda.carinspecation.data.CarsRecord;
import com.sda.carinspspection.model.CreditCard;
import com.sda.carinspspection.model.QueueSystem;
import com.sda.carinspspection.model.Vehicle;

public class InspectionProcess {
	
	QueueSystem queueSystem;
	CarsRecord carDb;
	CreditCard creditcard;
	PaymentSystem paymentSystem;
	boolean inspectionStatus;
	Vehicle newVehicle;
	
	public InspectionProcess(){
		queueSystem = new QueueSystem();
		carDb = new CarsRecord();
		creditcard= new CreditCard();
		paymentSystem=new PaymentSystem();
		inspectionStatus=false;
		newVehicle = new Vehicle();
	}
	
	public void setNewVehicle(Vehicle newVehicle){
		this.newVehicle=newVehicle;
	}
	public Vehicle getNewVehicle(){
		return newVehicle;
	}
	
	public void startNewInspection(int licenseNumber){
		newCustomerQueueDisplay();
		returnVehicleInformation(licenseNumber);
		int inspectionsCost=calculateVehicleInspectionsCost();
		System.out.println(inspectionsCost);
		payForInspections(inspectionsCost);
		startInspections();
		printResults();
		
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

	public Vehicle returnVehicleInformation(int licenseNumber) {
			Vehicle vehicle=checkVehicle(licenseNumber);
		return vehicle;
	}
	
	//Checks vehicle if exists if none adds it.
	public Vehicle checkVehicle(int licenseNumber) {
		if(carDb.searchVehicle(licenseNumber) !=null)
		{
			System.out.println("Vehicle exists");
			return carDb.searchVehicle(licenseNumber);
		}
		else
		{
		 carDb.addVehicle(licenseNumber,newVehicle);
		 System.out.println("added");
		 return carDb.searchVehicle(licenseNumber);
		}
	}
	
	public void startInspections(){
		for (int i=0;i<newVehicle.getRequiredInspections().size();i++)
		{
			System.out.println(newVehicle.getRequiredInspections().get(i).getName());
			newVehicle.getRequiredInspections().get(i).setStatus(inspectionStatus);
		}
	}
		
		public void printResults(){
			
			for (int i=0;i<newVehicle.getRequiredInspections().size();i++)
			{
				System.out.println("The inspection is "+newVehicle.getRequiredInspections().get(i).getName());
				System.out.println(newVehicle.getRequiredInspections().get(i).getStatus());
			}
	}
}