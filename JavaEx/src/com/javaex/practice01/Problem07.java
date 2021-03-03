package com.javaex.practice01;

import java.util.Scanner;
import java.util.Random;
public class Problem07 {
	public static void main(String[] args) {
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
