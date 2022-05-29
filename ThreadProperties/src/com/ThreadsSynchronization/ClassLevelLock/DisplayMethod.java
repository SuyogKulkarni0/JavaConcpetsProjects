package com.ThreadsSynchronization.ClassLevelLock;

public class DisplayMethod {
	void display(String str)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hey there "+str);
		}
		
	}
}
