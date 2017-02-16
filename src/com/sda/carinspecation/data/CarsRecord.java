package com.sda.carinspecation.data;

import java.util.HashMap;

import com.sda.carinspspection.model.Vehicle;

public class CarsRecord {
	HashMap <Integer,Vehicle> carsRecord ;
	
	public CarsRecord() {
		carsRecord =new HashMap<Integer,Vehicle>();
	}
	public void addVehicle(int licenseNumber,Vehicle newVehicle){
		carsRecord.put(licenseNumber, newVehicle);
	}
	
	public Vehicle searchVehicle(int licenseNumber){
		return carsRecord.get(licenseNumber);
	}
//	public ArrayList<Vehicle> getCarsRecord(){
//		ArrayList<Vehicle> vehicles = new ArrayList<>();
//		for(Vehicle v: carsRecord )
//			vehicles.add(v);
//		return vehicles;
//	}
}
