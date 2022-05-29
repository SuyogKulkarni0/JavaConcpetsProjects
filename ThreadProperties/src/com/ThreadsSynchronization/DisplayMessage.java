package com.ThreadsSynchronization;
// Synchronized will lock the object entering this synchronized block or method
//that is no other Thread can enter the block or method until the Previous Thread
//releases the lock on the Synchronized Block
public class DisplayMessage {
	public synchronized void display(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+name);
		}
	}

}
