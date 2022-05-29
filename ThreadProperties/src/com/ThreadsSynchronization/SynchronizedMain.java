package com.ThreadsSynchronization;

public class SynchronizedMain {

	public static void main(String[] args) {
		SynchronisedBlock t = new SynchronisedBlock();
		SynchronizedThread th = new SynchronizedThread("Suyog",t);
		SynchronizedThread th2 = new SynchronizedThread("Saloni",t);
		th.start();
		th2.start();
	}

}
