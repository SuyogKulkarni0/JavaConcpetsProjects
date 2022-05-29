package com.InterruptInThreads;
public class InterruptMethod extends Thread {
	@Override
	public void run()
	{
		try {
		for(int i=0;i<5;i++)
		{
			System.out.println("I am a Lazy thread");
		Thread.sleep(2000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception was raised !!");
		}
		}
}
