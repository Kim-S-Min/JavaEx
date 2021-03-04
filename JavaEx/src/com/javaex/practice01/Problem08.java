package com.javaex.practice01;

import java.util.Scanner;
public class Problem08 {
	public static void main(String[] args) {
		//	Problem08();	//	내가만든식
		Problem008();	//	강사님이만든식
	
		
		
	}
	private static void Problem008() {
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("=================================");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔고 | 4. 종료");	//	내가만든거 보다 5배는 깔끔;;;;
			System.out.println("=================================");
			
			System.out.print("선택 >> ");
			int menu = scanner.nextInt();
			int amount = 0;
			
			switch (menu) {
			case 1: //	입금
				System.out.print("입금액>> ");
				amount = scanner.nextInt();
				balance += amount;
				break;
			case 2: //	출금
				System.out.print("출금액>> ");
				amount = scanner.nextInt();
				balance -= amount;
				break;
			case 3: //	잔고
				System.out.println("잔고>> " + balance);
				break;
			case 4: //	종료
				run = false;
				System.out.println("(프로그램을 종료합니다)");
				break;
			default:	// 없는 메뉴
				System.out.println("다시 입력해 주세요");
			}
		}
		
		
	}
	private static void Problem08() {
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
