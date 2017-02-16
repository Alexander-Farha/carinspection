package com.sda.carinspection.control;

import com.sda.carinspspection.model.CreditCard;

public class PaymentSystem {
	boolean paidConfirmation=false;
	
//	public void paymentChoice(int choice){
//		switch (choice) {
//			case 1: requestAuthorization(CreditCard c , int totalInspectionCost);
//					break;
//		}
//	}
	public 	void requestAuthorization(CreditCard c,int totalInspectionsCost) {
		if(c.balanceCheck()==true)
			payByCreditCard(c,totalInspectionsCost);	
	}
	
	public void payByCreditCard(CreditCard creditCard ,int totalCost) {
		 if ((creditCard.getBalance()-totalCost)>0)
		 {
			creditCard.setBalance(creditCard.getBalance()-totalCost);
			System.out.println("Thanks for using our services");
			paidConfirmation=true;
			printReceipt(totalCost);
		 }
		 else
		 {
			 System.out.println("Not enough money");
		 }
	}
	
	public void payByCash(int cashAmount){
		paidConfirmation=true;
		printReceipt(cashAmount);
	}
	
	public void printReceipt(int totalCost){
		if(paidConfirmation==true)
			System.out.print("Thanks for payment"+ totalCost );
	}

}
