package com.in28minutes.concurrency;

public class Counter {

	private int i = 0;

	synchronized public void increment() {
		i++;
	}

	public int getI() {
		return i;
	}

}