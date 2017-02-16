package com.sda.carinspection.dbholder;

public class VehicleSpecification {
	String modelName;
	int doorNumbers;
	int topSpeed;
	boolean no2;
	int enginePower;
	
	public VehicleSpecification (String modelName,int doorNumbers,int topSpeed,boolean no2 ,int enginePower) {
		this.modelName=modelName;
		this.doorNumbers=doorNumbers;
		this.topSpeed=topSpeed;
		this.no2=no2;
		this.enginePower=enginePower;
	}
	
}
