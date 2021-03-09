package com.javaex.exceptions;


import java.io.IOException;
public class ThrowsExcept {
	public void executeChecked() 
			throws IOException {
		System.err.println("강제 체크드 예외 발생");
		//	예외 발생
		throw new IOException("강제 예외");	//	강제로 예외시키는 명령어
		//	IOException은 checked exception -> 반드시 예외처리가 필요하다
		
		
	}
	public void executRunTime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");	//	unchecked 에외 -> 예외 처리를 강요하지 않는다
		
		
	}
	public double divide(int num1, int num2) {
		double result;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			//	예외 전환: 보다 구체적인 예외로 전화하는 것
			throw new CustomArithmeticException("사용자 정의 Exception", num1, num2);
		}
		return result;
//		return num1 / num2;
	}
}
