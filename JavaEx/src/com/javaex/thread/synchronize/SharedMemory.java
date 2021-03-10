package com.javaex.thread.synchronize;

public class SharedMemory {
	private int memory;
	
	public int getMemort() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);	//	1sec
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
