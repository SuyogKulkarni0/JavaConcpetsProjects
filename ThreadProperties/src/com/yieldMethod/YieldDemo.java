package com.yieldMethod;

public class YieldDemo {

	public static void main(String[] args) {
		YieldMethod obj = new YieldMethod();
		obj.start();
//		try {
//			obj.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Suyog was here for Main Thread Execution");
		}
		System.out.println("Execution of the Main was Ended here");
	}

}

// Difference between the Yield and Join Method is that Join() 
//guarantees the Change of state of Thread from running to runnable that is it will 
//definitely stop for other Thread to complete its execution
// While Yield() method gives a chance to Thread of Equal Priority to finish its 
//execution but it does not guarantee that it will stop for the full execution of that thread
