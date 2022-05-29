package com.ThreadsSynchronization;

public class MyThread extends Thread{
	String name;
	DisplayMessage dm;
	MyThread(String name,DisplayMessage dm)
	{
		this.name=name;
		this.dm = dm;
	}
	public void run()
	{
		dm.display(name);
	}

}
