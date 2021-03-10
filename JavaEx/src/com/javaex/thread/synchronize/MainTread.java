package com.javaex.thread.synchronize;

public class MainTread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory();
		
		//	Thread creat
		User user1 = new User("철수", memory, 100);
		User user2 = new User("영희", memory, 50);
		
		user1.start();
		user2.start();

	}

}
