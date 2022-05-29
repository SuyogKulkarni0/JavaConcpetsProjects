package com.InterruptInThreads;

public class InterruptedDemo {
public static void main(String[] args) {
	InterruptMethod im = new InterruptMethod();
	im.start();
	im.interrupt();
	System.out.println("End of Main Thread");
}
}
