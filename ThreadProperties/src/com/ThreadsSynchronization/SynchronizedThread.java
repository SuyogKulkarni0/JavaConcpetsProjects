package com.ThreadsSynchronization;

public class SynchronizedThread extends Thread{
	String name;
	SynchronisedBlock s;
	SynchronizedThread(String name,SynchronisedBlock s)
	{
		this.name = name;
		this.s=s;
	}
	public void run()
	{
		s.display(name);
	}
}
