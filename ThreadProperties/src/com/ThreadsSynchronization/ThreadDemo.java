package com.ThreadsSynchronization;

public class ThreadDemo {

	public static void main(String[] args) {

	DisplayMessage dm = new DisplayMessage();
	MyThread t = new MyThread("Suyog",dm);
	MyThread t2 = new MyThread("Saloni",dm);
	t.start();
	t2.start();

}
}
