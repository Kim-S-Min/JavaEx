package com.javaex.practice01;

import java.util.Scanner;
import java.util.Random;
public class Problem07 {
	public static void main(String[] args) {
		//	Problem07();	//	내가 만든식
		Problem007();	//	강사님이 만든식
	}
	private static void Problem007() {
		 Scanner scanner = new Scanner(System.in);
		 
		 //	바깥쪽 루프	//	게임이 끝났을때 더할껀지에 대한 루프
		 while(true) {
			 //	게임 로직
			 int num = (int)(Math.random() * 100) + 1;	//	1~100사이에 정수난수
			 System.out.println("===================");
			 System.out.println(" 문자맞추기게임 시작");
			 System.out.println("===================");
			 
			 while(true) {
				 System.out.print(num + ">> ");
				 int inputNum= scanner.nextInt();
				 //	num와 inputNum을 비교 -> 정답 체크
				 if (inputNum == num) {
					 System.out.println("정답입니다.");
					 break;
				 } else if (inputNum < num) {
					 System.out.println("더 높게");
				 } else {
					 System.out.println("더 낮게");
				 }
			 }
			 
			 System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
			 String retry = scanner.next();	//	더 진행할 것인지 물어봄
			 
			 if (retry.equals("y")) {
				 break;
			 }
		 }
		 scanner.close();
	}
	private static void Problem07() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("=================================\n\t[문자맞추기게임 시작]\n=================================");
	
	
	double dValue = Math.random();
	int iValue = (int)(dValue * 100);
	System.out.println(iValue);	//	마지막에 지우자
	//y와 n의 을 지정해야한다 
	
	
	for (int i = 0; i <= 100; i++) {
		System.out.print(">> ");
		int num = scanner.nextInt();
		if (iValue == num) {
			System.out.println("정답입니다");
		} else if (iValue > num) {
			System.out.println("더 높게");
		} else {
			System.out.println("더 낮게");
		} break;
		
		
		// y가 출력되면 게임 재시작
		// n이 출력되면 게임종료출력 및 종료
		//char yorn = scanner.nextChar();
		//System.out.print("게임을 종료하기겠습니까? >> ")
	}
	System.out.print("게임을 종료하시겠습니까? (Y/N) >> ");
	scanner.close();	
	
	}
}
