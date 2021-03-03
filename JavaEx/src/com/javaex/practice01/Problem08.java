package com.javaex.practice01;

import java.util.Scanner;
public class Problem08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("==============================\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n==============================");
			System.out.print("선택 > ");
			int num1 = scanner.nextInt();
			if (num1 == 1) {
				System.out.print("예금액 > ");
				int num2 = scanner.nextInt();
				System.out.println(num2 + money);
			} else if (num1 == 2) {
				System.out.print("출금액 > ");
				int num3 = scanner.nextInt();
				System.out.println(money - num3);
			} else if (num1 == 3) {
				System.out.println("잔고액 > " + money);
			} else {
				System.out.println("프로그램 종료");
				break;
			}
				//	money값을 변경하고나서 값을 저장해야한다.
		
		
		}
		scanner.close();
	
	}
	
	
}
