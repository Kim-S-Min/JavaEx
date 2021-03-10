package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		//	Main Thread의 흐름과 다른 별도의 작업 흐름을 만드려면
		Thread thread = new DigitThread();
		thread.setName("DigitTread");
		
		//	쓰레드 시작
		thread.start();	//	밑에있는 알파벳과 동시에 숫자가 출력된다
		
		//	주의!
		thread.run();	//	먼저 숫자가 출력이 되고 출력이 완료가 되면 알파벳이 출력된다
		
		//	Main Thread: A ~ Z 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread: " + ch);
			
			//	잠시 대기
			try {
				Thread.sleep(300);	//	0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
