package com.sda.carinspspection.model;

import com.sda.carinspection.integration.Screen;

public class QueueSystem {
	public  int queueNumber;
	Screen newScreen = new Screen();
	
	public void incrementQueueNumber() {
		queueNumber++;
	}
	public void displayCurrentNumber(){
		newScreen.ShowcurrentQueueNumber(queueNumber);
	}

}
