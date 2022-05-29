package com.ThreadsSynchronization;

public class SynchronisedBlock {
	void display(String name)
	{
		// Now new Coming thread can access or enter the display() method till Synchronized 
		//Block but once it a Thread enters a Synchronized block it lock the block for the 
		//thread Execution and doesn't leave till it's finished
		// this caused the whole application run faster than holding whole process for Synchronization
		synchronized(this)
		{
			System.out.println("This is Message from Synchronised Block to "+name);
		}
	}
}
