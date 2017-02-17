package com.sda.carinspspection.model;

import java.util.ArrayList;

public class Vehicle {

	private String ownerName;
	private int licenseNumber;
	private ArrayList<Inspection> requiredInspections;

	public Vehicle(){
		requiredInspections= new ArrayList<>();
	}
	public Vehicle(int licenseNumber){
		this.licenseNumber=licenseNumber;
		requiredInspections= new ArrayList<>();	
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	
	public int getLicenseNumber() {
		return licenseNumber;
	}
	
	public void setLicensNumber(int licensNumber) {
		this.licenseNumber=licensNumber;
	}
	public ArrayList<Inspection> getRequiredInspections(){
		return this.requiredInspections;
	}
	
	public void setRequiredInspections(Inspection inspection){
		requiredInspections.add(inspection);
	}
	
	public void addInspection(String name,int cost,boolean status){
		Inspection newInspection=new Inspection();
		newInspection.setName(name);
		newInspection.setCost(cost);
		newInspection.setStatus(status);
		requiredInspections.add(newInspection);
	}
	
	public int caluculateCost(){
		int totalCost=0;
		for(Inspection i: requiredInspections){
			totalCost=totalCost+i.getCost();
		}
		return totalCost;
	}
}

