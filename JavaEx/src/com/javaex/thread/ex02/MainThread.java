package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		//	Main Thread의 흐름과 다른 별도의 작업 흐름을 만드려면
		Thread thread = new DigitThread();
		thread.setName("DigitTread");
		
		//	쓰레드 시작
		thread.start();	//	밑에있는 알파벳과 동시에 숫자가 출력된다	//	start() 메서드 내에서 run메서드를 대신 수행한다
		
		//	주의!
//		thread.run();	//	먼저 숫자가 출력이 되고 출력이 완료가 되면 알파벳이 출력된다	//	일반 메서드로 run을 수행한 것이다
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		//	생성자에 run메서드가 구현된 Runnable객체를 전달한다
		thread2.start();
		
		//	Working Thread의 제어권을 유지하기 위해
		//	작업흐름을 main쓰레드에 합류한다
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MainThread Stop!");
	}

}
