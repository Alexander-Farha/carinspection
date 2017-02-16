package com.sda.carinspspection.model;

public class CreditCard {
	private int creditNo;
	private int balance;
	
	public int getCreditNo()
	{
		return creditNo;
	}	
	public void setCreditNo(int creditNo){
		this.creditNo=creditNo;
	}
	
	public int getBalance()
	{
		return balance;
	}	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}	
	
	public CreditCard(int creditNo,int balance) {
		this.creditNo=creditNo;
		this.balance=balance;
	}
	public CreditCard(){
		
	}
	public boolean balanceCheck() {
		if(balance>0)
			return true;
		else
			return false;
	}
}
