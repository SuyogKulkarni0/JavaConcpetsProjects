package com.yieldMethod;
// Yield Method makes 
public class YieldMethod extends Thread{
	@Override
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("Suyog was here for Child Thread");
		Thread.yield();
	}
	}

}
