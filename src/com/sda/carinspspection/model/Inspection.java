package com.sda.carinspspection.model;

public class Inspection {
	private int  cost;
	private String name;
	private boolean status;
	
	
	public int getCost() {
		return cost;
	}
	public void setCost (int cost){
		this.cost=cost;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}	
	public boolean getStatus ()
	{
		return status;
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	
	public Inspection() {
	}
	
	public Inspection(int cost, String name , boolean status) {
		this.cost = cost;
		this.name= name;
		this.status= status;
	}
 }
