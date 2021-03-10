package com.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
		//	Main Thread의 흐름과 다른 별도의 작업 흐름을 만드려면
		//	thread의 우선순의를 결졍할 수 있다: 1(MIN) ~ 7(NORMAL) ~ 10(MAX)
		//	CPU 자원이 부족할 때, 어느 쓰레드를 우선 실행시킬지 결정한다
		Thread thread = new DigitThread();
		thread.setName("DigitTread");
		thread.setPriority(Thread.MAX_PRIORITY);	//	10
		
		
		//	쓰레드 시작
		thread.start();	//	밑에있는 알파벳과 동시에 숫자가 출력된다	//	start() 메서드 내에서 run메서드를 대신 수행한다
		
		//	주의!
//		thread.run();	//	먼저 숫자가 출력이 되고 출력이 완료가 되면 알파벳이 출력된다	//	일반 메서드로 run을 수행한 것이다
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		thread2.setPriority(Thread.MIN_PRIORITY);	//	1
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
